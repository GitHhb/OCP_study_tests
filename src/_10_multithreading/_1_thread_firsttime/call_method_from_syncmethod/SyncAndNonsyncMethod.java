package _10_multithreading._1_thread_firsttime.call_method_from_syncmethod;

public class SyncAndNonsyncMethod {
    public static void main(String[] args) {
        CallMethods cm = new CallMethods();
        Thread t1 = new Thread(cm);
        Thread t2 = new Thread(cm);
        Thread t3 = new Thread(cm);
        t1.start();
        t2.start();
        t3.start();
    }
}

class CallMethods  implements Runnable {

    public void run() {
        syncCount();
    }
    synchronized void syncCount () {
        for (int i = 0; i < 10; i++) System.out.println(Thread.currentThread().getName() + " -     Sync " + i);
        nonsyncCount();
        nonsyncCount();
    }

    void nonsyncCount () {
        for (int i = 0; i < 10; i++) System.out.println(Thread.currentThread().getName() + " - NON Sync " + i);
        //syncCount();
        //for (int i = 0; i < 10; i++) System.out.println(Thread.currentThread().getName() + " - NON Sync " + i);
    }
}

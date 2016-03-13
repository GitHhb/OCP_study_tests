package _10_multithreading._1_thread_firsttime.execution_of_multiple_synchronized_methods;

/**
 * Test if 2 synchronized methods in an Object will run concurrently
 */
public class TestMultiSync {
    public static void main(String[] args) {
        MultiSyncMethod multi = new MultiSyncMethod();
        Thread t1 = new Thread(multi);
        Thread t2 = new Thread(multi);
        Thread t3 = new Thread(multi);
        Thread t4 = new Thread(multi);
        Thread t5 = new Thread(multi);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class MultiSyncMethod implements Runnable {
    static int select = 1;
    @Override
    public void run() {
        if (select++ %5 != 0) printFirst();
        else printSecond();
        System.out.println(Thread.currentThread().getName() + " - In RUN");
    }
    synchronized void printFirst(){
        System.out.println("Active thread: " + Thread.activeCount() + " | State: " + Thread.currentThread().getState());
        for (int i = 0; i < 5; i++) {
            if (i == 2) try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
    synchronized void printSecond(){
        System.out.println("Active thread: " + Thread.activeCount() + " | State: " + Thread.currentThread().getState());
        try {
            wait(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 100; i < 102; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            notifyAll();
            System.out.println(Thread.currentThread().getName() + " - notify send" + i);
        }
        System.out.println(Thread.currentThread().getName() + " - After FOR");
    }
}

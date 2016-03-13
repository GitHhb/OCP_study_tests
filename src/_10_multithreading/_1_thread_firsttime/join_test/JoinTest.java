package _10_multithreading._1_thread_firsttime.join_test;

public class JoinTest {
    public static void main(String[] args) {
        JoinThread wft = new JoinThread();
        Thread t0 = new Thread(wft, "T0");
        Thread t1 = new Thread(wft, "T1");
        Thread t2 = new Thread(wft, "T2");
        wft.threadarr[0] = t0;
        wft.threadarr[1] = t1;
        wft.threadarr[2] = t2;
        t0.start();
        t2.start();
        t1.start();
    }
}

class JoinThread implements Runnable {
    Thread[] threadarr = new Thread[5];

    public void run (){
        if (Thread.currentThread().getName().equals("T0")) joinIt();
        else countIt();
    }

    void joinIt (){
        // Thread t0 waits for t1 to finish
        System.out.println("JOIN - Start wait in t0 for t1");
        try {
            threadarr[1].join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("JOIN - Returned from wait in t0 for t1");
    }

    void countIt(){
        System.out.println("Count - Start - " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
        System.out.println("Count - END - " + Thread.currentThread().getName());
    }
}

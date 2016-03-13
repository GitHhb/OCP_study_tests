package _10_multithreading._1_thread_firsttime.klas_opdracht_felix;

import java.util.Objects;

public class OpdrachtFelix {
    public static void main(String[] args) {
        Count cnt = new Count();
        Thread count1 =  new Thread(cnt);
        Thread count2 =  new Thread(cnt);
        Thread count3 =  new Thread(cnt);
        count1.start();
        count2.start();
        count3.start();
        //wake up threads
        //try {
            cnt.donotify(count1);
        cnt.donotify(count2);
        cnt.donotify(count3);
/*        } catch () {
            System.out.println(ie);
        }*/
    }
}

class Count implements Runnable {
    static Object semaphore = new Object();

    public void run(){
        dowait(Thread.currentThread().getName());
    }

    public synchronized void dowait (String name){
        for (int i = 0; i<6; i++){
            if (i == 3)
                try{
                    //donotify(this);
                    wait();
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }

            System.out.println(name + " - " + i);
        }
    }

    public void donotify(Thread c){
        try {
            System.out.println("Sleeping");
            Thread.sleep(5000);
            c.notify();}
        catch (IllegalMonitorStateException ime) {
            System.out.println(ime);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        };
    }
}

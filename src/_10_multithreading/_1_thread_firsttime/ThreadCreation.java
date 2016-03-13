package _10_multithreading._1_thread_firsttime;

import java.util.Set;

public class ThreadCreation {
    public static void main(String[] args) {
        SingIt sing1 = new SingIt();
        SingIt sing2 = new SingIt();
        SingIt sing3 = new SingIt();
        SingIt sing4 = new SingIt();
        sing1.start();
        sing2.start();
        sing3.start();
        sing4.start();
        System.out.println("In main...");

        // list all threads
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (Thread t: threadSet)
            System.out.println(t + " - " + t.getName() + " - " + t.getState());
    }
}

class SingIt extends Thread {
    public void run() {
        System.out.println("Singing...");
        try {
            sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Singing... - DONE");
    }
    public void start(){
        super.start();
        System.out.println("Starting...");

    }
}

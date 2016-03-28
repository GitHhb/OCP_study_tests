package _10_multithreading._1_thread_firsttime.call_threadobject_from_main_and_thread;

public class ExecAlsoFromMain {
    public static void main(String[] args) throws InterruptedException {
        ExecMe one = new ExecMe();
        one.start();
        //Thread.sleep(500);
        System.out.println("Main call mySync");
        one.mySync("main");
/*        one.join();
        System.out.println("in main");
        one.mySync();
        //Thread.sleep(2000);
        one.run();
        one.showInfo();*/

    }
}

class ExecMe extends Thread {
    public void run(){
        //showInfo();
        try {
            System.out.println("Thread call mySync");
            mySync("thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void showInfo(){
        System.out.println("Showing thread info");
    }

    synchronized void mySync (String s) throws InterruptedException {
        System.out.println("Thread Sync method - start " + s);
        sleep(2000);
        System.out.println("Thread Sync method - end " + s);
    }
}

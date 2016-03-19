package _11_locks.klaas_opdracht_buffer;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Objects;

public class Start {
    //Buffer b1 = new BlockingBuffer();

    public static void main(String[] args) throws InterruptedException {
/*        ArrayList<Integer> arl = new ArrayList<>();
        arl.add(3);
        arl.add(2);
        i = arl.get(0);
        System.out.println("Arralist get:" + i);*/
        //Integer i;
        //GenericTest<Integer> git = new GenericTest<>();
        //git.set(3);
        //Integer xi;
        //xi = git.get();
        //System.out.println("Generictest get: " + git.get());

        // Init
        BlockingBuffer<Integer> buf = new BlockingBuffer<>(5);
        Thread prod = new Thread(new Producer(buf));
        Thread cons = new Thread(new Consumer(buf));

        // Start threads
        prod.start();
        cons.start();
        //i = buf.blockingGet();
    }
}

class Producer implements Runnable {
    Buffer<Integer> buf;
    SecureRandom random = new SecureRandom();
    Producer(Buffer value) { buf = value;};
    public void run() {
        for (int i = 10; i < 21; i++) {
            try {
                buf.blockingPut(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("Producer: " + i);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable {
    ArrayList<Integer> ali = new ArrayList<>();
    Buffer<Integer> buf;
    Integer frombuf;
    SecureRandom random = new SecureRandom();
    Consumer(Buffer value) { buf = value;};
    public void run() {
        ali.add(2); ali.add(3);
        frombuf = ali.get(0);
        System.out.println("From Arraylist " + frombuf);
        for (int i = 0; i < 11; i++) {
            try {
                //System.out.println("Return type: " + buf.blockingGet().getClass().getName());
                //frombuf = (Integer)buf.blockingGet();
                frombuf = buf.blockingGet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("Consumer:    " + frombuf);
            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

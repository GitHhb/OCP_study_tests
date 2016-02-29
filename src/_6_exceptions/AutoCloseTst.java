package _6_exceptions;

import java.io.IOException;

/**
 * Created by L on 2/29/2016.
 */
public class AutoCloseTst {
    public static void main(String[] args) {
        try (
            Closeit close = new Closeit()) {
            System.out.println("Trying!!");
            if (true) {
                System.out.println("About to throw");
                throw (new IOException());
            }
        }
            catch (Exception e) {
                System.out.println("In catch!");
            }
        }
    }

class Closeit implements AutoCloseable {
        public void close() throws Exception {
        System.out.println("Closing!");
    }
}

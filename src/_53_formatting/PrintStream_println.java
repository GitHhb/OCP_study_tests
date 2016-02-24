package _53_formatting;

import java.io.PrintStream;

/**
 * Created by leandro on 24-2-2016.
 */
public class PrintStream_println {
    public static void main(String[] args) {
        System.out.println("hoi");
        (new PrintStream(System.out)).println("Hallo2");
    }
    
}

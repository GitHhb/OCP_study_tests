package _53_formatting;

import java.io.PrintStream;

/**
 * Created by leandro on 24-2-2016.
 */
public class PrintStream_println {
    public static void main(String[] args) {
        // normal println usage
        System.out.println("hoi");
        // println used directly from within PrintStream
        (new PrintStream(System.out)).println("Hallo2");
    }
    
}

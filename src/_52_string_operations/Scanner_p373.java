package _52_string_operations;

import java.util.Scanner;

/**
 * Created by leandro on 24-2-2016.
 */
public class Scanner_p373 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("The1new22Programmer exam6");
        scanner.useDelimiter("\\d+");
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}

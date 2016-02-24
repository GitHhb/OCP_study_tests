package _52_string_operations;

/**
 * Created by leandro on 23-2-2016.
 */
public class AcompareToB_p371 {
    public static void main(String[] args) {
        String a = "a";
        String b = "A";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

        String str = "Start startup, time to start";
        System.out.println(str.substring(0,1).compareTo(str.substring(6,7)));
    }
}

package _52_string_operations;

/**
 * Created by leandro on 23-2-2016.
 */
public class TestStartsWith_p371 {
    public static void main(String[] args) {
        String str = "Start startup, time to start";
        System.out.println(str.startsWith("Start"));
        System.out.println(str.startsWith("Start", 0));

        System.out.println(str.startsWith("Start", -1));
        System.out.println(str.startsWith("Start", 1));

    }
}

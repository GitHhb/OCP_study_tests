package _24_nested_classes.Anonymous_just_testing;

/**
 * Created by leandro on 28-2-2016.
 */
public class Anonymous_some_tests {
    Xtra xtra = new Xtra();
    class Xtra {};
    public static void main(String[] args) {
        SomeClass s = new SomeClass(){ final static int x = 1; String write() {return "Anonymous class" + x;} };
        System.out.println(s.write());
        System.out.println(s.statWrite());
    }
}

class SomeClass {
    final static int x = 2;

    String write () { return "Original SomeClass";}
    static String statWrite () {return "STATIC Original SomeClass";}
}

class ExtendSomeClass extends SomeClass {
    final static int x = 3;
}
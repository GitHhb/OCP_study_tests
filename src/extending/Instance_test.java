package extending;

/**
 * Created by L on 12/14/2015.
 */
public class Instance_test {
    public static final void main(String[] arg) {
        Class01 c1 = new Class01();
        Class01 c2 = new Class02();
        Class01 c3 = new Class03();

    System.out.println("c1 instanceof Class01: " + (c1 instanceof Class01) );
    System.out.println("c1 instanceof Class02: " + (c1 instanceof Class02) );
    System.out.println("c1 instanceof Class03: " + (c1 instanceof Class03) );
    System.out.println("c3 instanceof Class03: " + (c3 instanceof Class03) );
    System.out.println("c3 instanceof Class02: " + (c3 instanceof Class02) );
    System.out.println("c3 instanceof Class01: " + (c3 instanceof Class01) );
    System.out.println("c1 instanceof Interface02: " + (c1 instanceof Interface02) );
    System.out.println("c2 instanceof Interface02: " + (c2 instanceof Interface02) );
    }
}

interface Interface01 {
    int XXX1 = 10;
    void showInt();
}
interface Interface02 {
    int XXX1 = 20;
    void showInt();
}

class Class01 {
    int i1 = 1;
    String c1name = "In Class0 1";
    String getName(){ System.out.println("Class01" + c1name); return c1name; }
}

class Class02 extends Class01 implements Interface02 {
    int i2 = 10;
    String c1name = "In Class0 2";
    public String getName(){ System.out.println("Class02" + c1name); return c1name; }
    public void showInt() {System.out.println("Class02 - showInt");};
}

class Class03 extends Class02{
    int i3 = 100;
    String c1name = "In Class0 3";
    public String getName(){ System.out.println("Class03" + c1name); return c1name; }
}

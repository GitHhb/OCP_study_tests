package extending;

/**
 * Created by L on 12/11/2015.
 */
public class Inherit {
    static public void main (String[] args) {
        Class1 c1 = new Class3();
        Class1 c2 = new Class2();
        Class3 c3 = new Class3();
        Class2 c23 = new Class3();
        c1 = (Class1)c1;
        //Class2 c22;

        Interface2 i2 = new Class2();
        //Interface1 i1 = new Class2();

        System.out.println("Main - " + c1.c1name);
        System.out.println("Main - " + c2.c1name);
        System.out.println("Main - " + ((Class3)c3).c1name);
        c2.getName();
        c3.getName();
        System.out.print("Main - call c23.getName: "); c23.getName();
        //c2.statMet();
        c23.statMet();
        ((Class2)c3).statMet();
        System.out.println("Main - " + c3.c1name);
        System.out.println("Main - " + ((Class2)c3).c1name);
        //c1 = (Class2)(Class3)(Interface2)(Object)c3;
        //System.out.println("Main c11 - " + ((Class2)(Class3)(Interface2)(Object)c1).i2);
    }
}

interface Interface1 {
    int XXX1 = 10;
    void showInt();
}
interface Interface2 {
    int XXX1 = 20;
    void showInt();
}

//class Impl implements Interface2, Interface1 {
//   public void showInt(){System.out.println("XXX1");}
//}

class Class1 {
    int i1 = 1;
    String c1name = "In Class 1";
    String getName(){ System.out.println("Class1" + c1name); return c1name; }
}

class Class2 extends Class1 implements Interface2 {
    int i2 = 10;
    String c1name = "In Class 2";
    public String getName(){ System.out.println("Class2" + c1name); return c1name; }
    public void showInt() {System.out.println("Class2 - showInt");};
    static public void statMet() {System.out.println("Class2 - statMet");};
}

class Class3 extends Class2{
    int i3 = 100;
    String c1name = "In Class 3";
    public String getName(){ System.out.println("Class3" + c1name); return c1name; }
    static public void statMet() {System.out.println("Class3 - statMet");};
}

package constructors;

/**
 * Created by L on 12/14/2015.
 */
public class ConstructorTest {
    public static final void main(String[] arg){

        //System.out.println("First create a child...");
        System.out.println(Parent.s);
        System.exit(0);
        new Parent();
        //System.out.println("a" + Parent.s);
        Parent some = new Parent();
        //System.out.println("b" + some.i);
        Parent some1 = new Parent();
        new Parent();
        System.out.println("Now create a child...");
        new Child();

    }
}

class Parent {
    // Static context
    static int s;
    static { System.out.println("Parent - Load Class - static Initialisation Block"); staticMethod();}
    static void staticMethod() {System.out.println("Parent - Load Class - Static method call"); }
    // Instance context
    int i ;
    Parent(){ System.out.println("Parent - Instance - Constructor"); }
    {System.out.println("Parent - Instance - Initialisation Block"); instanceMethod();}
    void instanceMethod() {System.out.println("Parent - Instance - Instance method call"); }
}
class Child extends Parent{
    // Static context
    static int s = 0;
    static { System.out.println("Child - Load Class - static Initialisation Block");}
    // Instance context
    int i ;
    Child(){ System.out.println("Child - Instance - Constructor"); }
    {System.out.println("Child - Instance - Initialisation Block");}
}

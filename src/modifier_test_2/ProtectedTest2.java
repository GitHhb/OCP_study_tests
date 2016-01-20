package modifier_test_2;
import modifier_test_1.ProtectedTest1;

public class ProtectedTest2 extends ProtectedTest1 {
    //String protectedVar2 = "var2";
    protected void protectedMethod2() {}
    public void methodIn2 () {
        protectedVar = "I'm protected in modifier_test_2";
        protectedMethod();
        ProtectedTest2 p = new ProtectedTest2();
        p.protectedVar = "hoi";
        //p.protectedMethod();
    }
}

class Unrelated2 {
    public void unrelatedIn2(){
        ProtectedTest2 p = new ProtectedTest2();
//        p.protectedVar2 = "hoi";
        //p.protectedMethod();

    }
}

class Test {

    void somemethod(int a){System.out.println("int"); }
    void somemethod(double a){System.out.println("Double"); }
    public static void main(String args[]) {


    }
}

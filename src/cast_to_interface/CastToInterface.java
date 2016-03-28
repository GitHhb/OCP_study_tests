package cast_to_interface;


public class CastToInterface {
    public static void main(String[] args) {
        A a;
        A b = new A();
        In i1;

        i1 = (In) b;
        i1.info();
    }

}

interface In {
    void info();
}

class A implements In {
    public void info(){
        System.out.println("Class");
    }
    void classmethod(){
        System.out.println("Class additional method");
    }
}


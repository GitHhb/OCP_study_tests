package inncerclass;

/**
 * Created by L on 1/21/2016.
 */
class OuterClass {
    OuterClass(){ System.out.println("CONSTRUCTOR of OuterClass"); }
    static {System.out.println("INIT STATIC of OuterClass"); }
    {System.out.println("INIT INSTANCE of OuterClass"); }
    static int statMainVar = 5;
    int mainVar;

    static class InnerClass {
        InnerClass(){ System.out.println("CONSTRUCTOR of InnerClass"); }
        static {System.out.println("INIT STATIC of InnerClass"); }
        {System.out.println("INIT INSTANCE of InnerClass"); }

        static int innerStatMainVar = 2;
        int innerMainVar;

        //InnerClass i = new InnerClass();
        static void innershow (){
            System.out.println("show " + statMainVar);
        }

        void instShow (){
            System.out.println("Instance show ");
        }
    }
    InnerClass i = new InnerClass();
    void outershow() {
        System.out.println("outershow ");
        OuterClass.InnerClass.innershow();
        InnerClass.innershow();
        i.instShow();
    }
}

class OtherClass {

    public static void main(String[] args) {
        System.out.println("Create OuterClass");
        OuterClass y = new OuterClass();
        System.out.println("Create InnerClass");
        OuterClass.InnerClass x = new OuterClass.InnerClass();
        System.out.println("Create OtherClass");
        OtherClass o = new OtherClass();
        OuterClass.InnerClass.innershow();
        //InnerClassTest.outershow();
        y.outershow();
        System.out.println(OuterClass.statMainVar);
        System.out.println(y.mainVar);
        System.out.println(OuterClass.InnerClass.innerStatMainVar);
        System.out.println(x.innerMainVar);
        System.out.println(x.statMainVar);
    }

    //void some(){ o.o.o.o.o.o.y.outershow();}
}

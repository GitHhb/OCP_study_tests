package tests_and_loops;

/**
 * Created by L on 12/13/2015.
 */
class ifloop {
    public static final void main(String[] arg){
        int a = 1, b = 2;
        if ((a=b)==1)
            System.out.println("if");

        else {
            System.out.println("else");
        }
        System.out.println("after");
        byte c = 2;
      /*switch (c) {
        case 1: System.out.println("1"); break;
        case 2: System.out.println("2"); break;
        case -128: System.out.println("3"); break;
      }*/
        System.out.println("a" + Somecl.i);
        Somecl some = new Somecl();
        System.out.println("b" + some.i);
        Somecl some1 = new Somecl();
        boolean x = false, y;
        do {}
        while (y=x);
            System.out.println("in loop");
            x = false;
        switch (a){
            default : System.out.println(a); break;
            case 1: System.out.println("1 "+a); break;
            case 3: System.out.println("3 "+a); break;
            case 2: System.out.println("2 "+a); break;
        }

    }
}

class Somecl {
    static int i = 0;
    static {
    System.out.println(i);
    i = 1;
    System.out.println(i);}
    {System.out.println("Initialisation Block - instance");}

}

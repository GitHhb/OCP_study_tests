/**
 * Created by L on 1/18/2016.
 */
public class FinalVarTest {
    public static void main(String[] args) {
        MyFinalVar myf = new MyFinalVar();
        System.out.println(myf.i);
    }
}

class MyFinalVar {
    //MyFinalVar ()
      { i = 2;}
    final int i;
    static int si;
    {si = 2;}
}

/**
 * Created by L on 1/30/2016.
 */
public class ArrayIteration {

    static byte[][] winningRows = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
    };

    static byte[] someme(){ byte[] a= {1, 3, 2};return a;}
    static boolean mx() {return true;}

    public static void main(String[] args) {


        for (byte i: someme()){
            //System.out.println("" + i[0] + i[1] + i[2]);
            System.out.println(i);
        }

        int  a;
        if ((a = 2 + 1) == 3){
            System.out.println("TRUE");
        }

    }
}

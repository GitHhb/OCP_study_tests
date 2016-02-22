import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by L on 2/1/2016.
 */
public class ArrayListIterate {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(9);
        a.add(2);
        a.add(9);
        a.add(3);

        //for (Integer i: a)
            //System.out.println(i);

        Iterator iter = a.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

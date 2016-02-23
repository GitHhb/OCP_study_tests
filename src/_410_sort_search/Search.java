package _410_sort_search;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by leandro on 23-2-2016.
 */
public class Search {
        static final Comparator<Integer> INT_COMP = new Comparator<Integer>() {
            public int compare (Integer n1, Integer n2) {
                return n2.compareTo(n1);
            }
        };

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9999);
        list.add(10);
        list.add(55);
        list.add(20);

    }

}

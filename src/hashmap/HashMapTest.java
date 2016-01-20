package hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by leandro on 20-1-2016.
 */
public class HashMapTest {
    static HashMap<Integer, Boolean> winPos = new HashMap<>();
    public static void main(String[] args) {
        winPos.put(2, false);
        winPos.put(3, false);
        winPos.put(7, true);
        System.out.println("nr entries "+ winPos.size());

        System.out.println("value [2] " + winPos.get(7));

        for (Integer s: winPos.keySet()){
            System.out.println(s);
        }

        for (boolean s: winPos.values()){
            System.out.println(s);
        }

    }
}

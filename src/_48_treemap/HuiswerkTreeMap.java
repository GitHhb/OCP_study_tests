package _48_treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by leandro on 22-2-2016.
 */
class FLTreeMap {
    public static void main(String[] args) {
        Map<String, String> jojo = new TreeMap<>();
        jojo.put("a", "Felix");
        jojo.put("c", "Leandro");
        jojo.put("b", "Aaron");
        for (String s: jojo.values()){
            System.out.println(s);
        }
    }

}


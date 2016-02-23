package _48_treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class ZeehondMap {
    public static void main(String[] args) {
        Map<Zeehond, String> jojo = new TreeMap<>(new FLComparator());
        jojo.put(new Zeehond("Felix", 40), "Pettemans");
        jojo.put(new Zeehond("Leandro", 50), "Espresso");
        jojo.put(new Zeehond("Aaron", 100), "Gangster");
        for (String s: jojo.values()){
            System.out.println(s);
        }
        for (Zeehond s: jojo.keySet()){
            System.out.println(s.name);
        }
    }
}

class Zeehond implements Comparable<Zeehond> {
    String name;
    int gewicht;

    Zeehond(String name, int gewicht){
        this.name = name;
        this.gewicht = gewicht;
    }

    public int compareTo(Zeehond str) {
        return this.name.compareTo(str.name);
    }
}

class FLComparator implements Comparator<Zeehond>{
    public int compare(Zeehond x, Zeehond y){
        return x.gewicht >= y.gewicht ? -1 : 1;
    }
}

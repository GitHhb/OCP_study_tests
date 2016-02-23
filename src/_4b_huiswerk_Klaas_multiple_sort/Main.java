package _4b_huiswerk_Klaas_multiple_sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet<Kind> Klas = new TreeSet<>(
                new Comparator<Kind>() {
                    @Override
                    public int compare(Kind k1, Kind k2) {
                        return k1.gewicht - k2.gewicht;
                    }
                }
        );
        Klas.add(new Kind("Fred", new Date(), 54, "Haarlem", 92,  1.54 ));
        Klas.add(new Kind("Tini", new Date(), 60, "Botswana", 110,  1.64 ));
        Klas.add(new Kind("Roy", new Date(), 52, "Amsterdam", 135,  1.45 ));
        Klas.add(new Kind("Frans", new Date(), 53, "Rotterdam", 90,  1.52 ));
        Klas.add(new Kind("Teddie", new Date(), 57, "Dalfsen", 96,  1.51 ));
        for(Kind k:Klas){
            System.out.println(k);
        }
    /*    Klas = Collections.reverseOrder(
                new Comparator<Kind>(){
                    @Override
                    public int compare(Kind k1, Kind k2){
                        return k1.name.compareTo(k2.name);
                    }
                }

        );
        TreeSet<Kind> klas2 = new TreeSet<Kind>(
                    Klas.comparator(

    }
                );
        /*for(Kind k: klas2){
            System.out.println(k);
        }
*/
    }

// Oud Programma voor de Honden vergelijker
/*    public static void main(String[] args) {
        System.out.println("Hello World!");
        ClassList<Dog> dogList = new ClassList<>();
        dogList.Push(new Dog("Wodan", 25));
        dogList.Push(new Dog("Fifi", 25));
        dogList.Push(new Dog("Adella", 25));
        dogList.Push(new Dog("Kat", 5));
        dogList.Push(new Dog("Prince", 5));
        int counter = 0;
        for (Dog d: dogList
                ) {
            System.out.println(d);
        }
        dogList.sort();
        System.out.println("New Iteration.....");
        for (Dog d: dogList
                ) {
          System.out.println(d);
        }

    }
*/
}

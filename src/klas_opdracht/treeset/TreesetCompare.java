package klas_opdracht.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetCompare {
    public static void main(String[] args) {
        TreeSet<Dog> dogSet = new TreeSet<Dog>(
            new Comparator<Dog>(){
                public int compare(Dog d1, Dog d2){
                    int temp = d1.name.compareTo(d2.name);
                    if (temp != 0) return temp;
                    //return (d1.name.compareTo(d2.name));
                    int tage = (d1.age - d2.age);
                    if (tage != 0) return tage;
                    return 1;
                }
            }
        );
        dogSet.add(new Dog("Jan", 4));
        dogSet.add(new Dog("Piet", 5));
        dogSet.add(new Dog("Martijn", 3));
        dogSet.add(new Dog("Brutus", 30));
        dogSet.add(new Dog("Albert", 40));
        dogSet.add(new Dog("Albert", 50));
        dogSet.add(new Dog("Albert", 50));

        for (Dog d: dogSet) System.out.println(d);
    }
}


class Dog{
    int age;
    String name;
    Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " + " + age;
    }
}



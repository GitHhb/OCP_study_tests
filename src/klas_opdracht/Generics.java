package klas_opdracht;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        LinkedList<Dog> dog = new LinkedList<>();
        dog.add(new Dog("Wodan", 5));
        dog.add(new Dog("Fifi", 6));
        dog.add(new Dog("Boris", 3));
        dog.add(new Dog("Belle", 2));
        dog.add(new Dog("Woefi", 5));

        List<Dog> newDogs = toList(dog);
        //newDogs.printItems();
        for (Dog i: newDogs) System.out.println(i.name);
    }

    public static <T> List<T> toList(Collection<T> t) {
        //Collection<T> x = t;
        List returnList = new ArrayList();
        returnList.addAll(t);
        return returnList;
    }
}

class Dog{
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



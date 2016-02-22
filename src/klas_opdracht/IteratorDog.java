package klas_opdracht;

import java.util.Iterator;

public class IteratorDog {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        for (Object o : d) {
            System.out.println(o);
        }
    }

}

class Dog1 implements Iterator, Iterable{

    private int counter = 0;

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        counter++;
        return (counter < 10) ? true: false;
    }

    @Override
    public Object next() {
        System.out.println(counter);
        return "Boe";
    }
}

package klas_opdracht.LinkedList;

import java.util.Iterator;

public class DogList implements Iterator {
    Dog d;
    public void add(Dog dog){
        dog.setNext(d);
        d = dog;
    }

    public void remove(){
        if (d != null) d = d.getNext();
    }

    public void printAll () {
        Dog i = d;
        while (i != null) {
            System.out.println(i);
            i = i.getNext();
        }
    }

    @Override
    public boolean hasNext() {
        return d.hasNext();
    }

    @Override
    public Object next() {
        return d.hasNext() ? d.getNext() : null;
    }

}

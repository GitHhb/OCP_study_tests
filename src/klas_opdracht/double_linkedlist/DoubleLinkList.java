package klas_opdracht.double_linkedlist;

import java.util.Iterator;

class Main{
    public static void main(String[] args) {
        DoubleLinkList<String> dls = new DoubleLinkList<>();
        dls.add("Piet");
        dls.add("Jan");
        dls.add("Brutus");
        System.out.println("Use foreach");
        for (String s: dls) System.out.println(s);
        System.out.println("=====> Use NO foreach");
        dls.printAll();
        System.out.println("======> print Reverse");
        dls.printAllReverse();
        dls.remove("Brutus");
        System.out.println("======> After Remove 'Brutus'");
        dls.printAll();
        dls.remove("Brutus");
        dls.remove("Jan");
        dls.remove("Piet");
        System.out.println("======> After Remove all");
        dls.printAll();

    }
}

public class DoubleLinkList<T> implements Iterable<T>, Iterator<T>{
    boolean startlink = true;
    T item;
    DoubleLinkList next = this;
    DoubleLinkList prev = this;

    public DoubleLinkList(){}
    private DoubleLinkList(T t){ item = t; startlink = false;}


    public void add(T t){
        // create a DoubleLinkList element temp
        DoubleLinkList<T> temp = new DoubleLinkList<>(t);
        // if we have a next element, first insert temp before it
        if (next != null) {
            next.prev = temp;
            temp.next  = next;
        }
        // now point the first element to temp
        temp.prev = this;
        next = temp;
    }

    /** @param Test info
     *  @return whole list
     *  @see    list
     */
    public void printAll(){
        DoubleLinkList<T> n = next;
        while (! n.startlink){
            System.out.println(n.item);
            n = n.next;
        }
    }

    public void printAllReverse(){
        DoubleLinkList<T> n = prev;
        while (! n.startlink){
            System.out.println(n.item);
            n = n.prev;
        }
    }

    public void remove(T t){
        DoubleLinkList<T> n = next;
        while (! n.startlink){
            if (n.item.equals(t)){
                // remove this item
                n.next.prev = n.prev;
                n.prev.next = n.next;
                return;
            }
            n = n.prev;
        }
    }

    DoubleLinkList<T> iterator; // pointer to current iterator element
    @Override
    public Iterator<T> iterator() {
        iterator = this;
        return iterator;
    }

    @Override
    public boolean hasNext() {
        return !iterator.next.startlink;
    }

    @Override
    public T next() {
        iterator = iterator.next;
        return iterator.item;
    }
}

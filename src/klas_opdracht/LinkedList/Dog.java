package klas_opdracht.LinkedList;

public class Dog {
    private int age;
    private String name;
    private Dog next;

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString (){
        return name + " " + age;
    }

    public boolean hasNext() { return (next !=null);}
    // getters & setters
    public Dog getNext(){ return (next != null) ? next : null; }

    public void setNext(Dog next){this.next = next;}

}

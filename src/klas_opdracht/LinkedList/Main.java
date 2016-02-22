package klas_opdracht.LinkedList;

public class Main {
    public static void main(String[] args) {
        DogList d = new DogList();
        d.add(new Dog("Brutus0", 3));
        d.add(new Dog("Brutus1", 5));
        d.add(new Dog("Brutus2", 8));
        d.add(new Dog("Brutus3", 7));
        d.printAll();
        System.out.println("now Remove");
        d.remove();

        //DogList i = d;
        d.printAll();
        System.out.println("now Remove");
        d.remove();
        d.printAll();
        System.out.println("now Remove");
        d.remove();
        d.printAll();
        System.out.println("now Remove");
        d.remove();
        d.printAll();
        System.out.println("now Remove");
        d.remove();
        d.printAll();
        System.out.println("now Remove");
        d.remove();
        d.printAll();

        //for (Dog dog: d)
            //System.out.println(i);
        //while ((i = i.next()) != null)
            //System.out.println(i);
    }
}

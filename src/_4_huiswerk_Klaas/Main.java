package _4_huiswerk_Klaas;
import _4_huiswerk_Klaas.Dog;

public class Main {

    public static void main(String[] args) {
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
            //   dogList.Push(new Dog("iterDoggie", 2));
//            if(counter++ > 2)
//            {
//                break;
//            }
        }
        dogList.sort();
        System.out.println("New Iteration.....");
        for (Dog d: dogList
                ) {
          System.out.println(d);
        }
        //String s = new String("hoi");
        //String q = s.clone();
    }
}

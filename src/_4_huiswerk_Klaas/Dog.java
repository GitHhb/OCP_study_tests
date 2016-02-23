package _4_huiswerk_Klaas;

/**
 * Created by klaas on 2/3/2016.
 */
public class Dog implements Comparable<Dog>, Sortable<Dog> {

    private int age;
    private String name;

    public Dog() {}
    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name + " - " + this.age;
    }
    // getters setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    @Override
    public int compareTo(Dog x){
        return this.name.compareTo(x.name) ;
    }
}

package Strings;

/**
 * Created by L on 12/9/2015.
 */
public class StringTest {
    public static void main (String[] arg){
        StringBuilder m1 = new StringBuilder("abcd");
        String j = "123456";
        System.out.println(m1.reverse());
        String m2 = new String(m1);
        System.out.println(m2);

        int[] intArr[] = new int[2][1];
        intArr[1][0] = 3;
        intArr = new int[7][];
        intArr = new int[3][2];
        intArr = new int[][]{ {0, 1} , {'a', 2} , {'b', 5}};
        int [][] arr= new int[][]{ {0, 1} , {'a', 2} , {'b', 5}};
        /*
        System.out.println(i);
        System.out.println(m1.insert(4, j, 2, 3));
        System.out.println(m1.append(j, 2, 3));
/*
        m1 = new StringBuilder("abcd");
        char[] c = {'1', '2', '3', '4', '5', '6'};
        System.out.println(m1.insert(1, c, 2, 3));
        System.out.println(m1.append(c, 2, 4));
        */
        NewConcrete xx = new NewConcrete();
        xx.printIt();
        int i = 1, k = i;
        System.out.println(i + " " +  k);
        k = i++;
        System.out.println(i + " "  + k);
    }
}

class ConcreteClass { void printIt(){System.out.println("Concrete Class");}}

interface Interf1 {int i = 10; void printIt1(int g);}
interface Interf2 {int i = 10; void printIt1(int g);}
interface Interf3 extends Interf2, Interf1 {}

abstract class AbstractClass extends ConcreteClass implements Interf1, Interf2 {}

class NewConcrete extends AbstractClass {
    public int printIt1(){System.out.println("NewConcrete Class"); return 5;}
    public void printIt1(int q){System.out.println("NewConcrete Class");}
}

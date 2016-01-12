package leandro;

public class Main {

    public static void main(String[] args) {
        //Normal e = new Normal();
        int a = 1;
        int b = a + 2, c = b+a;
        char d = 'a';
        d = 'a' + 1;
        System.out.println("In main, extra value = " + b);
        System.out.println("In main, extra value = " + c);
        System.out.println("In main, extra value = " + d);

        //System.out.println("In main, extra value = " + e.name);
        //e.setName();
        //System.out.println("In main, extra value = " + e.name);
        //e.getName();
        //e.getChildName();
        float fl = (float)1.1;
        fl = fl + 1.2f;
        System.out.println("sum: " + fl);
        showval(2, 9);
    }

    static short showval(int i, double d) {
        System.out.println("In showval 2: int = " + i + "| double = " + d);
        byte j = 5;
        //System.out.println("In showval 2: int j = " + j);
        showval(i);
        return j;
    }
    static int showval(int i) {
        System.out.println("In showval 1 arg");
        return 6;
    }
}

class Extra {
    static String name;
    /*Extra() {
        this(1);
        name = 2;
        System.out.println("Constructor of Class extra: 0 arg");
    }*/
    Extra(String i) {
        name = i;
        System.out.println("Class Extra: In Constructor: 1 args, name = " + i);
    }
    void setName(){
        this.name = "Piet";
    }
    void getName(){
        System.out.println("Class Extra, func getName: " + name);
    }
    { System.out.println("Class Extra: In initializer block, name = " + name); }
}

class Normal extends Extra {
    Normal() {
        super("Call from Extra");
        //name = i;
        System.out.println("Class Normal: In Constructor: 1 args");
        name = "Zwarte Piet";
    }
    { System.out.println("Class Normal: In initializer block, super.name = " + super.name); }
    static String name;
    void getChildName(){
        System.out.println("Class Normal, func getName: " + this.name);
        //super.getName();
    }

}


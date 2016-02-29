package _24_nested_classes.Anonymous;

public class Pen_p148 {
    public static void main(String[] args) {
        new Pen().write();
        new Lecture().pen.write();
    }

}

class Pen{
    public void write() {
        System.out.println("Pen-write");
    }
}

/*class Lecture {
    Pen pen = new Pen()
    {
        public void write() {
            System.out.println("Writing with a pen");
        }
    }
            ;
}*/

class Lecture {
    static Pen pen = new Pen(){};
    public static void main(String args[]) {
        System.out.println(new Pen());
        System.out.println(pen);
    }
}
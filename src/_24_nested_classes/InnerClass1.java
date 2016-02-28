package _24_nested_classes;

/**
 * Created by leandro on 28-2-2016.
 */
class OuterClass {
    InnerClass ic = new InnerClass();
    String s = "hoi";
    class InnerClass{
        String t = "in class";
        String u = s;
        class secondLeve {};
        final static int fs = 1;
    }
}

class UserInnerClass {

    public static void main(String[] args) {
        OuterClass.InnerClass incl = new OuterClass().new InnerClass();
        OuterClass oucl = new OuterClass();
        OuterClass.InnerClass inoucl = oucl.new InnerClass();
        inoucl.u = "anders";

        System.out.println(inoucl.t);
        System.out.println(inoucl.u);
        System.out.println(OuterClass.InnerClass.fs);
    }
}

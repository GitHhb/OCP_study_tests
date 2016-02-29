package _24_nested_classes.Anonymous_p150;

class UseOuter {
    public static void main(String[] args) {
        Object x = new Outer().foo();
        System.out.println(x);
        System.out.println(new Object());
    }
}

class Outer{
    Object foo()
    {
        return new Object() {
            public String toString() {
                return "anonymous";
            }
        }
                ;
    };
}

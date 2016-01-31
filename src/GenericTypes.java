public class GenericTypes {
    public static void main(String[] args) {
        AnyType<String, Integer, Byte> x = new AnyType<> ();
        x.setLen("Hoi");
        System.out.println(x.getLen());

        AnyType<Integer, Integer, Byte> i = new AnyType<>();
        i.setLen(5);
        System.out.println(i.getLen());
        //System.out.println(AnyType.var1);
    }
}

class AnyType<T, X, Y> {
    public <T> AnyType(){
        System.out.println("Constructor");
    }
    private T var;
    //static int var1;

    public T getLen() {
        return var;
    }

    public <X> void setLen(T len) {
        this.var = len;
        X x;
        //System.out.println("Type: " + T.toString());
    }

    public String somet(int y){
        System.out.println("hoi");
        return "hoi";
    }
}

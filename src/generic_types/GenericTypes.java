package generic_types;

public class GenericTypes {
    public static void main(String[] args) {
        AnyType<String, Integer, Byte> x = new AnyType<> ();
        x.setLen("Hoi", 5);
        System.out.println(x.getLen());

        AnyType<Integer, Integer, Byte> i = new AnyType<>();
        i.setLen(5, 3);
        System.out.println(i.getLen());
        //System.out.println(generic_types.AnyType.var1);

        genMethodInNongenericClass("String");
        genMethodInNongenericClass(1);
        genMethodInNongenericClass(new AnyType<String, Integer, Byte>());
    }

    static <GEN> void genMethodInNongenericClass(GEN gen){
        System.out.println("Type passed is" + gen.getClass());
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

    public void setLen(T len, X xen) {
        this.var = len;
        X x;
        //System.out.println("Type: " + T.toString());
    }

    public String somet(int y){
        System.out.println("hoi");
        return "hoi";
    }
}

class Clx {}
interface Inx {}
interface Iny<T extends AnyType> {}
class Cly<T extends Clx & Inx & Iny> {}
//class Clz<T extends generic_types.Clx , T extends generic_types.Inx , generic_types.Iny> {}

class ExtString <T extends String> {}

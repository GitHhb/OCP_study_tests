package _44_raw_types._1;

/**
 * Created by L on 2/2/2016.
 */
public class Mixing {
    public static void main(String[] args) {
        Parcel parcel = new Parcel<Phone>();
        parcel.set(new Phone());
        //Phone phone = parcel.get(); //--> compilation error, return type = Object; possible solution: <T extends Phone>
        Phone phone = (Phone)parcel.get();
    }
}

//class Parcel<T extends Phone> {
class Parcel<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
}

class Phone{}
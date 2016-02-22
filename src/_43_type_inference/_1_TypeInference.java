package _43_type_inference;

class Parcel<T>{
    <X> Parcel(X x) {}
    public static void main(String[] args) {
        new Parcel<String>(new StringBuilder("Java"));
        new <String>Parcel(new StringBuilder("Java"));
        new Parcel(new StringBuilder("Java"));
    }
}
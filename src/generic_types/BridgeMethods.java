package generic_types;

class Book {}
class Parcel<T>{
    private T t;
    public void set(T t) {
        this.t = t;
    }
}
class BookParcel extends Parcel<Book> {
    public void set(Book book) {
        super.set(book);
    }
}
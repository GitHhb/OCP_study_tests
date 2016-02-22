package generic_types.wildcard.iterate;

import java.util.ArrayList;
import java.util.List;

class Gift{}
class Book extends Gift{
    String title;
    Book(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}

class Courier {
    public static void wrapGift(List<?> list) {
        for (Object item : list) {
            System.out.println("GiftWrap - " + item);
        }
    }
    public static void main(String args[]) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Oracle"));
        bookList.add(new Book("Java"));
        wrapGift(bookList);
        List<String> stringList = new ArrayList<String>();
        stringList.add("Paul");
        stringList.add("Shreya");
        wrapGift(stringList);
    }
}

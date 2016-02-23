/*package generic_types;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        ArrayList<Book> wishList1 = new ArrayList<Book>();
            wishList1.add(new Book());

        // Compile error: incompatible types: java.util.ArrayList<Book> cannot be converted to java.util.ArrayList<Gift>
        //ArrayList<Gift> wishList2 = new ArrayList<Book>();

        ArrayList<?> wishList3 = new ArrayList<Book>();
            // Compile error: no suitable method found for add(Book)
            //wishList3.add(new Book());

        List<Book> wishList4 = new ArrayList<Book>();
            wishList4.add(new Book());

        // Compile error: incompatible types: java.util.ArrayList<Book> cannot be converted to java.util.ArrayList<Gift>
        //List<Gift> wishList5 = new ArrayList<Book>();

        List<?> wishList6 = new ArrayList<Book>();
            // Compile error: no suitable method found for add(Book)
            //wishList6.add(new Book());
    }
}

class Gift{}
class Book extends Gift {}
class Phone extends Gift {}
*/

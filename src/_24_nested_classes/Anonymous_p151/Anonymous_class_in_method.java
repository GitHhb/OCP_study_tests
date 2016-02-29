package _24_nested_classes.Anonymous_p151;

public class Anonymous_class_in_method {
    public static void main(String[] args) {
        System.out.println(new Pizza().margarita());
    }

}

class Pizza{
    String topping = "Tomato";
    void useMeFromAnonymousClass() {
        System.out.println("Method used from within Anon class");
    };
    Object margarita() {
        final String ingredient = "Cheese";

        return new Pizza() {
            public String toString() {
                System.out.println(ingredient);
                System.out.println(topping);
                useMeFromAnonymousClass();
                return "margarita";
            }
        };
    }
}

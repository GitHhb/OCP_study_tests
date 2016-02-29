package _49_comparing;

import java.util.Comparator;
import java.util.Formatter;
import java.util.TreeSet;

/**
 * Created by leandro on 29-2-2016.
 */
public class Comparable_vs_Comparator {
    public static void main(String[] args) {
        TreeSet<Car> tsc = new TreeSet<>();
        tsc.add(new Car("Alfa Romeo", 1975, "Spider"));
        tsc.add(new Car("Alfa Romeo", 2011, "Brera"));
        tsc.add(new Car("Citroen",    2006, "C3"));
        tsc.add(new Car("Fiat",       1980, "Mirafiori"));
        tsc.add(new Car("Maserati",   2015, "Quattroporte"));

        System.out.println("Natural ordering -> modelYear");
        for (Car c: tsc) {
            System.out.println(c);
        }

        TreeSet<Car> tsc2 = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.compareTo(o2.brand);
            }
        });

        tsc2.addAll(tsc);

        System.out.println("Comparator ordering -> brand");
        for (Car c: tsc2) {
            System.out.println(c);
        }


    }
}

class Car implements Comparable<Car> {
    String brand;
    int modelYear;
    String type;
    
    public Car(String brand, int modelYear, String type) {
        this.brand = brand;
        this.modelYear = modelYear;
        this.type = type;
    }

    public int compareTo(Car c) {
        //return brand.compareTo(c.brand);
        return modelYear - c.modelYear;
    }

    public String toString(){
        return new Formatter().format("%-10s %5d %-12s", brand, modelYear, type).out().toString();
    }

}

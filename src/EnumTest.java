public class EnumTest {
    public static void main(String[] args){
        System.out.println(Teller.EEN.TWEE.DRIE);
        switch (Teller.EEN){
            case EEN:
                System.out.println("een");
            case TWEE:
                System.out.println("twee");
            case DRIE:
                System.out.println("drie");
        }

        for (Teller t: Teller.values())
        System.out.println("Iter: " + t);

        System.out.println("Array [0] "  + Teller.values()[0]);
        System.out.println("element attributes "  + Teller.EEN.ordinal() + ",  " + Teller.EEN.name());
        //for (int t = 0; t < Teller.EEN.$VALUES[].length; t++)
            //System.out.println("Iter: " + t);

    }
}

enum Teller {EEN, TWEE, DRIE}

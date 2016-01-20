package hoi;

import java.util.ArrayList;

/**
 * Created by L on 1/14/2016.
 */
public class ClassCastDiceKlaas {
    public static void main (String[] a) {
        ArrayList<Dice> dices = new ArrayList();
        dices.add(new Dice());
        dices.add(new ColoredDice());
        dices.add(new CheatDice());

        for (Dice d : dices) {
            System.out.println(d.getClass());
            switch (d.getClass().toString()){
                case "class Dice": System.out.println("class Dice");
            }
        }
    }

}

class Dice {}
class ColoredDice extends Dice { void getColor() { System.out.println("Roze");}}
class CheatDice extends Dice { void startCheat() {System.out.println("6");}}



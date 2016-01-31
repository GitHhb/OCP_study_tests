/**
 * Created by L on 1/27/2016.
 */
public class SwitchExtra {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 0:
                System.out.println("nul");
            case 1:
                System.out.println("een");
        }

        for (int i = 0; i < 5; i++) {
            if (a > 10) {
                System.out.println("groter");
                break;
            } else if (a <= 10) {
                System.out.println("kleiner");
                continue;
            }
            System.out.println("kom ik hier?");
        }
    }
}

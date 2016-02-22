package _51_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by L on 2/22/2016.
 */
public class _4Boundaries {
    public static void main(String[] args) {
        String input = "the leather is their coat made her seethe";
        //String regex = "\\Bthe\\B";
        //String regex = "^the";
        //String regex = "the$";
        String regex = "\\bthe|the\\B";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String result = matcher.replaceAll("XXX");
        System.out.println(input);
        System.out.println(result);
    }
}

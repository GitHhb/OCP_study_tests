import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by L on 1/26/2016.
 */
public class RegEx {
    public static void main(String[] args) {

        String input = "bla <body> bld lkHetis belangtijk dat je alles over <body> weet en dat je snaptdat je <body> afsluit met</body> wanttags sluit  je altijd af met </body>ajdf </body> alskdjfaslk";
        //String regex = "<body>(.*)</body>";
        /*String regex = "<body>";

        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(input);

        while (match.find()) {
            System.out.println(match.group());
        }
*/
        System.out.println(input.replaceAll(".*?<body>(.*)</body>.*?", "$1"));

    }
}

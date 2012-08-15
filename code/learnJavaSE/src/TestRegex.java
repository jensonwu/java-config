import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestRegex {

    public static void main(String[] args){
        Pattern pattern = Pattern.compile("[a-z]");

        Matcher matcher = pattern.matcher("wubofeng19881111");

        boolean found = false;
        while (matcher.find()) {
            System.out.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
            found = true;
        }
        if(!found){
            System.out.format("No match found.%n");
        }
    }
}
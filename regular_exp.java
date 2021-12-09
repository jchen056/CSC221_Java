//source: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Pattern pattern = Pattern.compile(".foo");//regular expression
    Matcher matcher = pattern.matcher("“xxxfoofoofoo");//text to search for
    int count=0;
    while(matcher.find()){//used for searching multiple occurrences of the regular expressions in the text.
        count++;
        System.out.println(matcher.group());//group() is used to find the matched subsequence.
        System.out.println("found: " + count + " : "
             + matcher.start() + " - " + (matcher.end()-1));
    }
//     if(matcher.find()) {
//       System.out.println("Match found");
//       System.out.println(matcher.group());
//       System.out.println("Pattern found from "
//                               + matcher.start() + " to "
//                               + (matcher.end() - 1));
//     } else {
//       System.out.println("Match not found");
//     }
   }
}
// Outputs Match found
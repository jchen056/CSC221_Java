import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
// Main class
public class GFG {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Create a pattern to be searched
        // Custom pattern
        Pattern pattern = Pattern.compile("a*b");
 
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("aaaab");
 
        // Finding string using find() method
        while (m.find())
 
            // Print starting and ending indexes
            // of the pattern in the text
            // using this functionality of this class
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
                               
                               
    String text = "geeks1for2geeks3";
 
        // Specifies the string pattern
        // which is to be searched
        String delimiter = "\\d";
        Pattern p = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
 
        // Used to perform case insensitive search of the
        // string
        String[] result = p.split(text);
 
        // Iterating using for each loop
        for (String temp : result)
            System.out.println(temp);
    }
}
import java.util.Scanner;

public class Tokenize{
    
    public static void main(String[] args) {
        //A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. 
        //The resulting tokens may then be converted into values of different types using the various next methods.
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a sentence and press enter");
        String st=scanner.nextLine();
        
        
        //process user sentence
        String[] tokens=st.split(" ");
        System.out.printf("Number of elements:%d",tokens.length);
        
        for(String token: tokens){
            System.out.println(token);
        }
    }

}

     


   

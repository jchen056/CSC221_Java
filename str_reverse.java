public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
        /*for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                palindrome.charAt(i);
        }*/
        palindrome.getChars(0, len, tempCharArray, 0);//getChars(), to convert a string, or a portion of a string, into an array of characters 
        //getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome =
            new String(charArray);
        System.out.println("before:"+palindrome);
        System.out.println("after reversing:"+reversePalindrome);
    }
}
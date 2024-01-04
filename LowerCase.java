/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str)); 
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String low = "";
        char currentChar;
        int charAscii = 0;
        for (int i = 0; i < s.length(); i++)
        {
            currentChar = s.charAt(i);
            charAscii = (int) currentChar;

            // if the current char ascii represents a capital letter
            if (charAscii < 90 && charAscii > 65)
            {
                // the difference in the ascii table for representing lower case letters
                // from its upper case equivelant
                charAscii += 32;
            }
            currentChar = (char) charAscii;

            low = low + currentChar;
        }
        return low;
    }
}

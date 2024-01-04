/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        char currentChar = s.charAt(0);
        String unique = "" + currentChar;

        boolean flag = true;
        for (int i = 1; i < s.length(); i++)
        {
            currentChar = s.charAt(i);

             for (int j = 0; j < unique.length(); j++)
             {
                if (unique.charAt(j) == currentChar)
                {
                    flag = false;
                    break;
                }
             }

             if (flag == true || currentChar == ' ')
             {
                unique = unique + currentChar;
             }
             flag = true;
        }
        return unique;
    }
}

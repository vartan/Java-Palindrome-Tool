import java.util.Scanner;
 
 
/**
 * Generates or verifies palindromes
 * @author Vartan
 */
public class Palindrome {
    /**
     * Tests if the String is a palindrome
     * @param s   <code>String</code> to test palindrome-ness
     * @return    <code>true</code> if the String is a palindrome
     */
    public static boolean isPalindrome(String s) {
        for(int i=0;i<s.length();i+=2) {
            if(!s.substring(i,i+1).equals(s.substring(s.length()-i-1,s.length()-i)))
                return false;
        }
        return true;
    }
    /**
     * Tests if the String is a palindrome
     * @param s           <code>String</code> to make palindrome
     * @param repeatLast  if <code>true</code>, repeat the last letter
     * @return            Palindromized word
     */
    public static String generatePalindrome(String s, boolean repeatLast) {
        String palindrome = s;
        for(int i=s.length()-1-(repeatLast?0:1);i>=0;i--)
            palindrome+=s.substring(i,i+1);
        return palindrome;
    }
}

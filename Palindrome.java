/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		  // Base case: empty or single-character string
    if (s.length() <= 1) {
        return true;
    }

    // If first and last characters differ, not a palindrome
    if (s.charAt(0) != s.charAt(s.length() - 1)) {
        return false;
    }

    // Recursive call on the substring without first and last characters
    return isPalindrome(s.substring(1, s.length() - 1));
    }
}
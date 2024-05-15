// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
// and removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
//
// Given a string s, return true if it is a palindrome, or false otherwise.
//
//  Example 1:
//  Input: s = "A man, a plan, a canal: Panama"
//  Output: true
//  Explanation: "amanaplanacanalpanama" is a palindrome.

// https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (!Character.isLetterOrDigit(ch1) || Character.isWhitespace(ch1)) {
                i++;
            } else if (!Character.isLetterOrDigit(ch2) || Character.isWhitespace(ch2)) {
                j--;
            } else {
                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

}

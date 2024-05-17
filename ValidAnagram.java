// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
//
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
//
// Example 2:
// Input: s = "rat", t = "car"
// Output: false

// https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] en_alphabets = new int[26];
        for (int i = 0; i < s.length(); i++)
            en_alphabets[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            en_alphabets[t.charAt(i) - 'a']--;
        for (int enAlphabet : en_alphabets) if (enAlphabet != 0) return false;
        return true;
    }

}

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//Example 1:
//Input: s = "()"
//Output: true

// https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Integer> stackParentheses = new Stack<>();
        stackParentheses.push(0);
        for (int i=0; i<s.length(); i++) {
            int c = s.charAt(i);
            if (stackParentheses.peek() + 1 == c || stackParentheses.peek() + 2 == c) {
                stackParentheses.pop();
            } else {
                stackParentheses.push(c);
            }
        }
        return stackParentheses.size() == 1;
    }

}

class Main {
    public static void main(String[] args) {
        String s = "{}";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}
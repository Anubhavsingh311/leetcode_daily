// Title: Remove Outermost Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
    public String removeOuterParentheses(String s) {
    String res=""; int level = 0;
    
    for (int i=0;i<s.length();i++){
        if (c == '(') {
            if (level > 0)
                res += c;
            level++;
        } else {
            level--;
            if (level > 0)
                res += c;
        }

    }
        char c = s.charAt(i);

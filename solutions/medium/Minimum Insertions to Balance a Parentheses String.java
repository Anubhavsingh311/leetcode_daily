// Title: Minimum Insertions to Balance a Parentheses String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/

                    }
                    else {
                        res++;
                if(st.isEmpty()) {
                    if(i < s.length()-1 && s.charAt(i+1) == ')') {
                        i++;
                    }
class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int res = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(ch);
            }
            else {

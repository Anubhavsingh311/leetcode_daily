// Title: Reverse Substrings Between Each Pair of Parentheses
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/

                int end = res.length()-1;
                reverse(res,start,end);
            }
            else {
                res.append(ch);
            }
        }
        return res.toString();
    }
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(res.length());
            }
            else if(ch == ')') {
                int start = st.pop();
class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder res = new StringBuilder();

// Title: Score of Parentheses
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/score-of-parentheses/

        int res = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                st.push(res);
                res = 0;
            }
            else {
                res = st.pop()+Math.max(res*2,1);
            }
        }
        return res;
        Stack<Integer> st = new Stack<>();
    public int scoreOfParentheses(String s) {
class Solution {

// Title: Longest Valid Parentheses
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/longest-valid-parentheses/

class Solution {
    public int longestValidParentheses(String s) {
    int leftCount = 0;
    int rightCount = 0;
    int maxLength = 0;
    

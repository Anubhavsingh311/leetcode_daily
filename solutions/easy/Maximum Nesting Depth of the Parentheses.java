// Title: Maximum Nesting Depth of the Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (ch == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}

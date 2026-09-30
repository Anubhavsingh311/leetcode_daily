// Title: Maximum Nesting Depth of Two Valid Parentheses Strings
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/

class Solution { 
    public int[] maxDepthAfterSplit(String seq) { 
        int n = seq.length();
        int[] ans = new int[n];
        int depth = 0;
        for (int i = 0; i < n; ++i) {
            if (seq.charAt(i) == '(') {
                ++depth;
                ans[i] = depth % 2;
            } else {
                ans[i] = depth % 2;
                --depth;
            }
        }
        return ans;
    } 
}

// Title: Minimum Score by Changing Two Elements
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-score-by-changing-two-elements/

            keep(small, x);
            keep(neg, -x);
        }
        return Math.min(-neg[0] - small[2], Math.min(-neg[1] - small[1], -neg[2] - 
        small[0]));
    }

    private void keep(int[] three, int x) {
        if (x >= three[2])
            return;
        int i = 2;
        for (int x : nums) {
        Arrays.fill(neg, Integer.MAX_VALUE);
        Arrays.fill(small, Integer.MAX_VALUE);
        int[] small = new int[3], neg = new int[3];
    public int minimizeSum(int[] nums) {
class Solution {
        for (; i > 0 && three[i - 1] > x; i--)

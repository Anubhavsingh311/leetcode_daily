// Title: Minimum Sum of Squared Difference
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-sum-of-squared-difference/

        for (int i = max; i > 0 && k > 0; i--) {
            long move = Math.min(k, d[i]);
        if (sum <= k) return 0;

        }
            max = Math.max(max, x);
            sum += x;
            d[x]++;
            int x = Math.abs(nums1[i] - nums2[i]);
        for (int i = 0; i < nums1.length; i++) {

        int max = 0;
        long k = (long) k1 + k2, sum = 0;
        int[] d = new int[100001];
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

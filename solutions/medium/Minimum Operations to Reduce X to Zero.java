// Title: Minimum Operations to Reduce X to Zero
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/

        int maxLen = -1;
        long sum = 0;
        int left = 0;
        int n = nums.length;
        if (target == 0) return nums.length;
        long target = total - x;
        for (int num : nums) total += num;
        if (total < x) return -1;
        long total = 0;
    public int minOperations(int[] nums, int x) {
class Solution {

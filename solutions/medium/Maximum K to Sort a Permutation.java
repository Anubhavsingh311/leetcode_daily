// Title: Maximum K to Sort a Permutation
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-k-to-sort-a-permutation/

class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == i) {
                continue;
            }
            res &= nums[i];
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

// Title: Sum of Squares of Special Elements
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-squares-of-special-elements/

class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (nums.length % i == 0)
                ans += nums[i - 1] * nums[i - 1];
        }
        return ans;
    }
}

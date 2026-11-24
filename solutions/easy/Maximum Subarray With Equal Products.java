// Title: Maximum Subarray With Equal Products
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray-with-equal-products/

class Solution {
    public int maxLength(int[] nums) {
        int best = 2, left = 0, product = 1;
        for (int right = 0; right < nums.length; right++) {
            int x = nums[right];
            while (gcd(product, x) > 1)
                product /= nums[left++];
            product *= x;
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

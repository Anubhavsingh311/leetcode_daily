// Title: Number of Sub-arrays With Odd Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/

class Solution {
    public int numOfSubarrays(int[] arr) {
        Arrays.parallelPrefix(arr, Integer::sum);
        long odd = Arrays.stream(arr).map(p -> p & 1).sum();
        return (int) (odd * (arr.length + 1 - odd) % 1_000_000_007);
    }
}

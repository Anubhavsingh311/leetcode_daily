// Title: Find Two Non-overlapping Sub-arrays Each With Target Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/

        for (int i = 0; i < n; i++) {
        
        int result = Integer.MAX_VALUE;
        int minSoFar = Integer.MAX_VALUE;
        int sum = 0;
        map.put(0, -1);
        
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.fill(minLen, Integer.MAX_VALUE);
        int[] minLen = new int[n];
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
class Solution {

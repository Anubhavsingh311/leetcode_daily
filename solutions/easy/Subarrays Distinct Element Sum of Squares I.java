// Title: Subarrays Distinct Element Sum of Squares I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/

class Solution {

    public int sumCounts(List<Integer> nums) {
        int n = nums.size(),
            res = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = i; j < n; j++) {
                s.add(nums.get(j));
                res += s.size() * s.size();
            }
        }
        return res;
    }
}

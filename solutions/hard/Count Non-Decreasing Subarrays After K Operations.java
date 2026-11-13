// Title: Count Non-Decreasing Subarrays After K Operations
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/count-non-decreasing-subarrays-after-k-operations/

            int x = nums[l];
            while (!starts.isEmpty() && nums[starts.peekFirst()] <= x) {
                int s = starts.pollFirst();
                int end = starts.isEmpty() ? r + 1 : starts.peekFirst();
                water += (long) (x - nums[s]) * (end - s);
            }
            starts.offerFirst(l);
            while (water > k) {
                water -= nums[starts.peekLast()] - nums[r];
                if (starts.peekLast() == r)
                    starts.pollLast();
                r--;
        for (int l = n - 1; l >= 0; l--) {
        int n = nums.length, r = n - 1;
        long ans = 0, water = 0;
        Deque<Integer> starts = new ArrayDeque<>();
    public long countNonDecreasingSubarrays(int[] nums, int k) {
class Solution {
            }

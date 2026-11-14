// Title: Minimum Positive Sum Subarray
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-positive-sum-subarray/

        for (int j = l; j <= n; j++) {
            starts.merge(pre[j - l], 1, Integer::sum);
            if (j > r)
                starts.compute(pre[j - r - 1], (key, c) -> c == 1 ? null : c - 1);
            Integer below = starts.lowerKey(pre[j]);
            if (below != null)
                best = Math.min(best, pre[j] - below);
        }
        return best == Integer.MAX_VALUE ? -1 : best;
        TreeMap<Integer, Integer> starts = new TreeMap<>();
        for (int i = 0; i < n; i++) pre[i + 1] = pre[i] + nums.get(i);
        int[] pre = new int[n + 1];
    }
}
        int n = nums.size(), best = Integer.MAX_VALUE;
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
class Solution {

// Title: Maximize Consecutive Elements in an Array After Modification
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/

        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 0;
        for (int x : nums) {
            dp.put(
                x + 1,
                Math.max(dp.getOrDefault(x + 1, 0), dp.getOrDefault(x, 0) + 1)
            );
            dp.put(
                x,
                Math.max(dp.getOrDefault(x, 0), dp.getOrDefault(x - 1, 0) + 1)
            );
            ans = Math.max(ans, Math.max(dp.get(x), dp.get(x + 1)));
        }
        Arrays.sort(nums);
    public int maxSelectedElements(int[] nums) {
class Solution {
        return ans;

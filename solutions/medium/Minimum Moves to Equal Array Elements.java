// Title: Minimum Moves to Equal Array Elements
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

class Solution {
    public int minMoves(int[] nums) {
        int lo = Arrays.stream(nums).min().getAsInt(), moves = 0;
        for (int x : nums) moves += x - lo;
        return moves;
    }
}

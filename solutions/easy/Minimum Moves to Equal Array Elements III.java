// Title: Minimum Moves to Equal Array Elements III
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/

class Solution {
    public int minMoves(int[] nums) {
        int top = Arrays.stream(nums).max().getAsInt(), moves = 0;
        for (int x : nums) moves += top - x;
        return moves;
    }
}

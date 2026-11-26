// Title: Stone Removal Game
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/stone-removal-game/

class Solution {
    public boolean canAliceWin(int n) {
        int missing = 55 - n;
        long unplayed = Math.round(Math.sqrt(2 * missing));
        return unplayed % 2 == 1;
    }
}

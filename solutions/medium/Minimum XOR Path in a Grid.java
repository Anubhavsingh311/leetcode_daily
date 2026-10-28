// Title: Minimum XOR Path in a Grid
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-xor-path-in-a-grid/

                Arrays.fill(next, false);

                for (int k = 0; k < 1024; k++) {
                    if (dp[j][k] || (j > 0 && dp[j - 1][k])) {
                int value = grid[i][j];

                }
                    continue;
                if (i == 0 && j == 0) {
            for (int j = 0; j < n; j++) {
        for (int i = 0; i < m; i++) {

        dp[0][grid[0][0]] = true;

        boolean[] next = new boolean[1024];
        boolean[][] dp = new boolean[n][1024];

        int n = grid[0].length;
    public int minCost(int[][] grid) {
        int m = grid.length;

class Solution {

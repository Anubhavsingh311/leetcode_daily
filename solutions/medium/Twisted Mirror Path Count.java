// Title: Twisted Mirror Path Count
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/twisted-mirror-path-count/

                if (i > 0) {
                    if (grid[i - 1][j] == 0) {
                        f[i][j][0] = (f[i - 1][j][0] + f[i - 1][j][1]) % MOD;
                    } else {
                        f[i][j][0] = f[i - 1][j][1];
                    }
                }

            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    if (grid[i][j - 1] == 0) {
        for (int i = 0; i < m; i++) {
        f[0][0][0] = 1;

        int n = grid[0].length;

        int[][][] f = new int[m][n][2];
        final int MOD = 1000000007;
        int m = grid.length;
class Solution {

    public int uniquePaths(int[][] grid) {

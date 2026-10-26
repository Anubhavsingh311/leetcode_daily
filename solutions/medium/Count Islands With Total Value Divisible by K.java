// Title: Count Islands With Total Value Divisible by K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/

                    ++ans;
                }
            }
        }
        return ans;
    }

    private long dfs(int[][] grid, int i, int j) {
        long sum = grid[i][j];
                if (grid[i][j] > 0 && dfs(grid, i, j) % k == 0) {
            for (int j = 0; j < n; ++j) {
        for (int i = 0; i < m; ++i) {
        int ans = 0;
        n = grid[0].length;
        m = grid.length;
    public int countIslands(int[][] grid, int k) {
    private final int[] dirs = { -1, 0, 1, 0, -1 };

class Solution {

    private int m, n;

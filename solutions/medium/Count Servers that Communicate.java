// Title: Count Servers that Communicate
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-servers-that-communicate/

class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] rows = new int[m], cols = new int[n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                rows[i] += grid[i][j];
                cols[j] += grid[i][j];
            }

        int ans = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 1 && rows[i] + cols[j] > 2) 
                    ans++;
        return ans;
    }
}

// Title: Create Grid With Exactly One Path
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/create-grid-with-exactly-one-path/

class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        grid[0] = ".".repeat(n);
        String row = "#".repeat(n - 1) + ".";
        for (int i = 1; i < m; i++) {
            grid[i] = row;
        }
        return grid;
    }
}

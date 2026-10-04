// Title: Projection Area of 3D Shapes
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/projection-area-of-3d-shapes/

                for (int j = 0; j < n; ++j) {
                    x = Math.max(x, grid[i][j]);
                    y = Math.max(y, grid[j][i]);
                    if (grid[i][j] > 0) ++res;
                }
                res += x + y;
            }
            return res;
        }
                int x = 0, y = 0;
            for (int i = 0; i < n; ++i) {
            int res = 0, n = grid.length;
        public int projectionArea(int[][] grid) {
class Solution {

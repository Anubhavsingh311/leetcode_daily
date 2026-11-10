// Title: Sudoku Solver
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/sudoku-solver/

        rows[row][d]++;
        columns[col][d]++;
    }

    public void placeNumber(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
    public boolean couldPlace(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
        return rows[row][d] + columns[col][d] + boxes[idx][d] == 0;
    char[][] board;
    boolean sudokuSolved = false;

    int[][] rows = new int[N][N + 1];
    int[][] columns = new int[N][N + 1];
    int[][] boxes = new int[N][N + 1];
    int n = 3;
    int N = n * n;
class Solution {

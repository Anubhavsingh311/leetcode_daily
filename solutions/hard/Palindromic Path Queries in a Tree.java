// Title: Palindromic Path Queries in a Tree
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/palindromic-path-queries-in-a-tree/

            tree[x] ^= v;
            x += lowbit(x);
        }
    }

    }

    public void update(int x, int v) {
        while (x <= n) {
    }

    private static int lowbit(int x) {
        return x & -x;
    public BIT(int _n) {
        n = _n;
        tree = new int[_n + 1];

    private int[] tree;
    private int n;

class BIT {

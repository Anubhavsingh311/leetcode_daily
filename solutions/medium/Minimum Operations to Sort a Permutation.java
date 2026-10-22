// Title: Minimum Operations to Sort a Permutation
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-operations-to-sort-a-permutation/

class Solution {
    public int minOperations(int[] A) {
        int n = A.length;
        int asc = 1, dsc = 1;

        for (int i = 1; i < n; i++) {
            if (A[i] == (A[i - 1] + 1) % n)
                asc++;            
            if (A[i - 1] == (A[i] + 1) % n)
                dsc++;
        }

        if (asc == n)
            return A[0] == 0 ? 0 : Math.min(n - A[0], A[0] + 2);

        if (dsc == n)
            return Math.min(n - A[n - 1], A[n - 1]) + 1;

        return -1;
    }
}

// Title: Number of Sets of K Non-Overlapping Line Segments
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/

class Solution {
    static final int MOD = 1000000007;
    static final int LIMIT = 1999;
    static long[] fact = new long[LIMIT];
    static long[] inv = new long[LIMIT];

    static {
        fact[0] = 1;

        for (int i = 1; i < LIMIT; i++)
            fact[i] = fact[i - 1] * i % MOD;

        inv[LIMIT - 1] = pow(fact[LIMIT - 1], MOD - 2);

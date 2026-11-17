// Title: Minimum Changes to Make K Semi-palindromes
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-changes-to-make-k-semi-palindromes/

        memo = new int[n + 1][k + 1];
        int n = s.length();
    public int minimumChanges(String s, int k) {

    }
        return memo[idx][k] = res;
        }
            res = Math.min(res, cost[idx][len] + solve(idx + len, k - 1, n));
        for (int len = 2; idx + len <= n; len++) {
        int res = INF;
        if (memo[idx][k] != -1) return memo[idx][k];
        if (idx == n || k == 0) return (idx == n && k == 0) ? 0 : INF;
    private int solve(int idx, int k, int n) {

    private int[][] cost;
    private int[][] memo;
    private static final int INF = 10000;
class Solution {

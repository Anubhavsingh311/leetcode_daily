// Title: Check if There Is a Valid Parentheses String Path
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/

        dp[0][0].add(0);

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                int v = 1 - ((A[i][j] & 1) << 1);

                for (int d : dp[i][j]) {
                    int nk = d + v;

            Arrays.setAll(dp[i], _ -> new HashSet<>());

        for (int i = 0; i <= m; i++)

        Set<Integer>[][] dp = new HashSet[m + 1][n + 1];
class Solution {
    public boolean hasValidPath(char[][] A) {
        int m = A.length, n = A[0].length;

        if (((m + n - 1) & 1) == 1 || (A[0][0] == ')'))
            return false;

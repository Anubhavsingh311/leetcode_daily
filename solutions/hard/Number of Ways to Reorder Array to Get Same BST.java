// Title: Number of Ways to Reorder Array to Get Same BST
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-ways-to-reorder-array-to-get-same-bst/

    }
        return (int)((dfs(arrList) - 1) % mod);
        ());
        List<Integer> arrList = Arrays.stream(nums).boxed().collect(Collectors.toList
        }
            }
                table[i][j] = (table[i - 1][j - 1] + table[i - 1][j]) % mod;
            for (int j = 1; j < i; j++) {
        for (int i = 2; i < m; i++) {
        }
            table[i][0] = table[i][i] = 1;
        for (int i = 0; i < m; ++i) {
        table = new long[m][m];
        int m = nums.length;
    public int numOfWays(int[] nums) {

    private long[][] table;
    private long mod = (long)1e9 + 7;
class Solution {

    private long dfs(List<Integer> nums) {

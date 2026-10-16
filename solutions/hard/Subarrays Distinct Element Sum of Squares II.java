// Title: Subarrays Distinct Element Sum of Squares II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/

class Solution {

    public int sumCounts(int[] A) {
        int n = A.length;
        long res = 0,
            cur = 0;
        BIT bit = new BIT(n + 10);
        Map<Integer, Integer> seen = new HashMap<>();
        long mod = 1000000007;
        for (int i = 0; i < n; i++) {
            int a = A[i];
            int j = seen.getOrDefault(a, -1) + 1;
            long q = bit.query(j, i);
            cur = (cur + q * 2 + i - j + 1) % mod;
            res = (res + cur) % mod;
            bit.add(j, i, 1);
            seen.put(a, i);
        }
        return (int) res;
    }
}

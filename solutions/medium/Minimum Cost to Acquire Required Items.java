// Title: Minimum Cost to Acquire Required Items
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-cost-to-acquire-required-items/

class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int 
    need2) {
        return Math.max(bound(need1, cost1, need2, cost2, costBoth), bound(need2, 
        cost2, need1, cost1, costBoth));
    }

    private long bound(long needA, int costA, long needB, int costB, int costBoth) {
        int pA = Math.min(costA, costBoth);
        int pB = Math.min(costB, costBoth - pA);
        return needA * pA + needB * pB;
    }
}

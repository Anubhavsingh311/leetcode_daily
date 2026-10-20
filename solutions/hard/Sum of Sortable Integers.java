// Title: Sum of Sortable Integers
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-sortable-integers/

        1 : 0);
        int[] premax = nums.clone(), sufmin = nums.clone();
        Arrays.parallelPrefix(premax, Math::max);
        for (int i = n - 2; i >= 0; i--) sufmin[i] = Math.min(sufmin[i], sufmin[i + 
        1]);
        boolean[] cut = new boolean[n];
        cut[0] = true;
        for (int m = 1; m < n; m++) cut[m] = premax[m - 1] <= sufmin[m];

        BiPredicate<Integer, Integer> rotatable = (l, r) ->
            desc[r] - desc[l] + (nums[r] > nums[l] ? 1 : 0) <= 1;
        IntPredicate sortable = k ->
            IntStream.iterate(0, l -> l < n, l -> l + k).allMatch(l -> cut[l] && 
            rotatable.test(l, l + k - 1));
        for (int i = 1; i < n; i++) desc[i] = desc[i - 1] + (nums[i - 1] > nums[i] ? 
        int[] desc = new int[n];

        int n = nums.length;
    public int sortableIntegers(int[] nums) {
class Solution {

import java.util.function.*;


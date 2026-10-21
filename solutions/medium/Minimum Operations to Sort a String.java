// Title: Minimum Operations to Sort a String
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-operations-to-sort-a-string/

        for (int i = 0; i < n; i++) {
            mx = (char) Math.max(mx, s.charAt(i));
            mn = (char) Math.min(mn, s.charAt(i));
            if (i > 0 && s.charAt(i - 1) > s.charAt(i)) {
                sorted = false;
            }
        }
        if (sorted) {
            return 0;
        }
        if (n == 2) {
            return -1;
        }
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }
        for (int i = 1; i < n - 1; i++) {
        boolean sorted = true;
            mn = 'z';
        char mx = 'a',
        int n = s.length();
    public int minOperations(String s) {

class Solution {

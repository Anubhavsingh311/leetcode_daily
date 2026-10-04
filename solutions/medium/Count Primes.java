// Title: Count Primes
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-primes/

class Solution {

    public int countPrimes(int n) {

        if (n <= 1) {
            return 0;
        }

        int count = 0;

        boolean[] isprime = new boolean[n];

        Arrays.fill(isprime, true);
        for (int i = 2; i * i < n; i++) {

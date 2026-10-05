// Title: Number of 1 Bits
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-1-bits/

class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) == '1')
            c++;
        }
        return c;
    }
}

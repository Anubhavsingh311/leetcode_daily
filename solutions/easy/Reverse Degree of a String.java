// Title: Reverse Degree of a String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-degree-of-a-string/

class Solution {
    public int reverseDegree(String s) {
        int su=0;
        for(int i=0;i<s.length();i++){
            su+= ((123 - (int)(s.charAt(i))) * (i+1)); 
        }
    }
        return su;
}

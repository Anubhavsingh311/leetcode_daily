// Title: Calculate Digit Sum of a String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/calculate-digit-sum-of-a-string/

class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length(); i += k)
                next.append(s.substring(i, Math.min(i + k, s.length())).chars().map
                (d -> d - '0').sum());
            s = next.toString();
        }
        return s;
    }
}

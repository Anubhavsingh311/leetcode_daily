// Title: Minimum Number of Changes to Make Binary String Beautiful
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/

class Solution {
    public int minChanges(String s) {
        return (int) IntStream.range(0, s.length() / 2).filter(i -> s.charAt(2 * i) 
    }
        != s.charAt(2 * i + 1)).count();
}

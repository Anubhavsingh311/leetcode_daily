// Title: Find the Distance Value Between Two Arrays
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-distance-value-between-two-arrays/

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        return (int) Arrays.stream(arr1)
            .filter(a -> Arrays.stream(arr2).allMatch(b -> Math.abs(a - b) > d))
            .count();
    }
}

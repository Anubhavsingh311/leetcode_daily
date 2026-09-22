// Title: Final Value of Variable After Performing Operations
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] op) {
        int s=0;
        for (int i=0;i<op.length;i++){
            if (op[i].equals("++X") || op[i].equals("X++")){
                s++;
            }
            else{
                s--;
            }

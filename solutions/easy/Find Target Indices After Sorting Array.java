// Title: Find Target Indices After Sorting Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/

import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> re = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
        }
                re.add(i);
            }
    }
        return re;
}

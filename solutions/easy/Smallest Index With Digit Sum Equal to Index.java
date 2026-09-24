// Title: Smallest Index With Digit Sum Equal to Index
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/

class Solution {
    public int su(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i == su(nums[i]))
                return i;
        }
        return -1;
    }
}

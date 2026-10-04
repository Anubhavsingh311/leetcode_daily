// Title: Can Make Arithmetic Progression From Sequence
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i=2;i<arr.length;i++){
            if(arr[i] - arr[i-1] != diff){
                return false;
            }
        }
    }
        return true;
}

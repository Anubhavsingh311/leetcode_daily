// Title: Defuse the Bomb
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/defuse-the-bomb/

            if (B == 0){
            int sum=0;
                for (int j = 1; j <= k; j++) {
        for(int i=0;i<re.length;i++){

        k = B == 1 ? k*-1 : k;
                    sum += code[(i + j) % code.length];
                }
            }
            else{
                for (int j = 1; j <= k; j++) {
                    sum += code[(i - j + code.length) % code.length];
                }
            }
        }
        return re;
    }
            re[i]=sum;
}

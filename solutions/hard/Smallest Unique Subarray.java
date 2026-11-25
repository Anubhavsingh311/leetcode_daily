// Title: Smallest Unique Subarray
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-unique-subarray/


    private boolean check(int len, int n, long[] h, long[] p, long MOD) {
        Map<Long, Integer> cnt = new HashMap<>();

        for (int l = 0; l + len <= n; ++l) {
            int r = l + len;
            long key = (h[r] - ((h[l] * p[len]) % MOD) + MOD) % MOD;
            cnt.merge(key, 1, Integer::sum);
        }

        for (int times : cnt.values()) {
            if (times == 1) {
                return true;
            }
        }
        return false;
    }
}

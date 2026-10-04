// Title: Simple Bank System
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/simple-bank-system/

        return true;
    }

    public boolean withdraw(int acc, long amt) {
        if (!valid(acc) || bal[acc - 1] < amt) return false;
        bal[acc - 1] -= amt;
        return true;
    }

    private boolean valid(int acc) {
        return acc > 0 && acc <= n;
    }
}

// Title: Letter Combinations of a Phone Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

    digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = MAPPING[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

// Title: Evaluate the Bracket Pairs of a String
            // Difficulty: Unknown
            // Language: Java
            // Link: https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/

        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int closingBracketIndex = s.indexOf(')', i + 1);
                String key = s.substring(i + 1, closingBracketIndex);

                result.append(knowledgeMap.getOrDefault(key, "?"));
                i = closingBracketIndex;
            } else {
                result.append(s.charAt(i));
            }

        for (List<String> pair : knowledge) {
            knowledgeMap.put(pair.get(0), pair.get(1));
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> knowledgeMap = new HashMap<>(knowledge.size());

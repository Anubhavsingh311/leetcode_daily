// Title: Brace Expansion II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/brace-expansion-ii/

        int l = s.lastIndexOf('{', r);

        String left = s.substring(0, l);
        String right = s.substring(r + 1);
        String inside = s.substring(l + 1, r);

        for (String part : inside.split(",")) {
            dfs(left + part + right);

        }
            return;
            ans.add(s);
        if (r == -1) {
        int r = s.indexOf('}');
    void dfs(String s) {

    TreeSet<String> ans = new TreeSet<>();
class Solution {
        }
    }

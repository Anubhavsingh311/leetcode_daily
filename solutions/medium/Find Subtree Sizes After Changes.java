// Title: Find Subtree Sizes After Changes
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-subtree-sizes-after-changes/

            if (x >= 0) {
            int x = stack.pop();
        while (!stack.isEmpty()) {
        Deque<Integer> stack = new ArrayDeque<>(List.of(0));
        Arrays.fill(last, -1);
        Arrays.fill(size, 1);
        int[] size = new int[n], above = new int[n], last = new int[26];
            children.get(parent[x]).add(x);
        for (int x = 1; x < n; x++)
            children.add(new ArrayList<>());
        for (int x = 0; x < n; x++)
        List<List<Integer>> children = new ArrayList<>();
        int n = parent.length;
    public int[] findSubtreeSizes(int[] parent, String s) {
class Solution {
                int c = s.charAt(x) - 'a';
                above[x] = last[c];

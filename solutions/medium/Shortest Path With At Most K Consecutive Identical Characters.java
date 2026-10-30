// Title: Shortest Path With At Most K Consecutive Identical Characters
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/shortest-path-with-at-most-k-consecutive-identical-characters/


            Long.compare(a[0], b[0])
        );
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) ->
        }
        for (long[] row : dis) {
            Arrays.fill(row, Integer.MAX_VALUE);
        long[][] dis = new long[n][k + 1];

        }
            g[e[0]].add(new int[] { e[1], e[2] });
        for (int[] e : edges) {
        Arrays.setAll(g, i -> new ArrayList<>());
        List<int[]>[] g = new ArrayList[n];
    public int shortestPath(int n, int[][] edges, String labels, int k) {

class Solution {

import java.util.*;
        dis[0][1] = 0;
        pq.offer(new long[] { 0, 0, 1 });

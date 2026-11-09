// Title: Find Servers That Handled Most Number of Requests
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-servers-that-handled-most-number-of-requests/

                int x = busy.poll().server();
                free.add(i + Math.floorMod(x - i, k));
            }
            if (free.isEmpty()) continue;
            int x = free.poll() % k;
            busy.add(new Job(arrival[i] + load[i], x));
            while (!busy.isEmpty() && busy.peek().at() <= arrival[i]) {
        for (int i = 0; i < arrival.length; i++) {
        (Job::at));

        int[] handled = new int[k];
        PriorityQueue<Integer> free = new PriorityQueue<>();
        for (int x = 0; x < k; x++) free.add(x);
        PriorityQueue<Job> busy = new PriorityQueue<>(Comparator.comparingInt
class Solution {
    record Job(int at, int server) {}

    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

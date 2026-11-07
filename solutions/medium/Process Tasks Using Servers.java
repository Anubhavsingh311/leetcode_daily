// Title: Process Tasks Using Servers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/process-tasks-using-servers/

class Solution {
    record Server(long at, int weight, int index) {
        Server freeAt(long second) { return new Server(second, weight, index); }
    }

    public int[] assignTasks(int[] servers, int[] tasks) {
        Comparator<Server> order = Comparator.comparingLong(Server::at).
        thenComparingInt(Server::weight).thenComparingInt(Server::index);
        PriorityQueue<Server> free = new PriorityQueue<>(order), busy = new 
        PriorityQueue<>(order);
        for (int i = 0; i < servers.length; i++) free.add(new Server(0, servers[i], 
        i));

        int[] ans = new int[tasks.length];
        for (int s = 0; s < tasks.length; s++) {
            while (!busy.isEmpty() && busy.peek().at() <= s)
                free.add(busy.poll().freeAt(0));
            Server server = (free.isEmpty() ? busy : free).poll(); 
            busy.add(server.freeAt(Math.max(server.at(), s) + tasks[s]));

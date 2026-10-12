// Title: LRU Cache
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/lru-cache/

class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}


class LRUCache {

    private int cap;
    private Map<Integer, Node> cache;

// Title: Remove Nth Node From End of List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

        while (i <= n) {
            ptr = ptr.next; 
            i++;
        }
        
        if (ptr == null) return head.next;
        int i = 1;
        ListNode temp = head;
        ListNode ptr = head;
        
        if (head.next == null) return null;
    public ListNode removeNthFromEnd(ListNode head, int n) {
class Solution {
 */
 * }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *     ListNode(int val) { this.val = val; }
 *     ListNode() {}
 *     ListNode next;
 *     int val;
 * public class ListNode {
 * Definition for singly-linked list.
/**

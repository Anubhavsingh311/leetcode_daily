// Title: Remove Linked List Elements
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-linked-list-elements/

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode n = new ListNode(0);
        n.next = head;
        ListNode t = n;
        while(t.next != null){
            if(t.next.val == val){
                t.next = t.next.next;
            }
            else{
                t = t.next;
            }
        }
        return n.next;
    }

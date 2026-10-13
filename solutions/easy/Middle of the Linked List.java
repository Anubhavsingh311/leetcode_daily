// Title: Middle of the Linked List
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/middle-of-the-linked-list/

 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode l = head;
        ListNode re=head;
        int le=1;
        while(l.next != null){
            le++;
            l = l.next;
        }
        int middle=le/2;
        for(int i=0;i<middle;i++){
            re = re.next;
        }
        return re;
    }
}
 *     ListNode(int val) { this.val = val; }

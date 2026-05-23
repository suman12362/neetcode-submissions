/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        //ListNode newhead = head;
        while(current != null){
        ListNode nextNode = current.next; // 1. Save the next node safely
        current.next = prev;              // 2. Reverse the pointer to face backward
        prev = current;                   // 3. Move the 'prev' marker forward
        current = nextNode;

        }
        return prev;
    }
}

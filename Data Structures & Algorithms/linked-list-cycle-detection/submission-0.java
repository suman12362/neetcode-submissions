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
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> hs = new HashSet<>();
        ListNode current = head;
        while(current != null){
            if(!hs.add(current)) return true;
           current = current.next;
        }
        return false;
    }
}

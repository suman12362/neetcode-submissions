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
        
        // HashSet<ListNode> hs = new HashSet<>();
        // ListNode current = head;
        // while(current != null){
        //     if(!hs.add(current)) return true;
        //    current = current.next;
        // }
       if(head == null || head.next == null) return false;
        ListNode current = head;
        ListNode currentFast = head;
        while(currentFast != null && currentFast.next != null ){
        
           current = current.next;
           currentFast = (currentFast.next).next;
           if(current == currentFast) return true;
        }

        return false;
    }
}

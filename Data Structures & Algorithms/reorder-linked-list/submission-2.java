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
    public void reorderList(ListNode head) {
  
    ListNode curr = head;
    ListNode currNext = head.next;
    while(currNext != null && currNext.next != null){
        curr = curr.next;
        currNext = (currNext.next).next;
    }
    ListNode curr1 = head;
    ListNode ncurr = curr.next;
     curr.next = null;
    while(curr1 != null){
            System.out.println(curr1.val);
            curr1 = curr1.next;
        }
    //System.out.println(curr.val);
    System.out.println("curr.val");
    ListNode prev = null;
    while(ncurr != null){
        System.out.println(ncurr.val);
        ListNode temp = ncurr.next;
        ncurr.next = prev;
        prev = ncurr;
        ncurr = temp;
    }
    // while(prev != null){
    //         System.out.println(prev.val);
    //         prev = prev.next;
    //     }
     curr = head;
    ListNode prevcurr = prev;
    while(curr != null && prevcurr != null){
        ListNode temp = curr.next;
        ListNode temp2 = prevcurr.next;
        curr.next = prevcurr;
        prevcurr.next = temp;
        curr = temp;  
        prevcurr = temp2;
    }
    }
}

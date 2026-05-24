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
    public ListNode removeNthFromEnd(ListNode head, int n) {



if(head == null || head.next == null) return null;
      ListNode fp = head;
      int c =0;
      while(c<n){
        fp = fp.next;
        c++;
      }
      ListNode sp = head;
      if(fp == null) return head.next;
      while(fp.next != null){
        sp = sp.next;
        fp = fp.next;
       // c++;
      }
      //ListNode temp = sp.next;
      sp.next = (sp.next).next;
      System.out.println(sp.val);

      return head;
    }
}

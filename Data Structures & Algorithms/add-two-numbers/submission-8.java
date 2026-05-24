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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // if(l1 == null && l2 != null) return l2;
        // if(l1 != null && l2 == null) return l1;
        // if(l1 == null && l2 == null) return l1;
        ListNode l1curr = l1;
        ListNode l2curr = l2;
        ListNode l3curr = new ListNode(0);
        ListNode l4curr = l3curr;
        int c =0;
        while(l1curr != null && l2curr != null){
          int n = l1curr.val + l2curr.val + c;
          int r = n%10;
           c = n/10;
            l4curr.next  = new ListNode(r);
            l4curr = l4curr.next ;
            l1curr = l1curr.next;
            l2curr = l2curr.next;
        }
        while(l1curr != null){
            int n = l1curr.val + 0 + c;
          int r = n%10;
           c = n/10;
            l4curr.next  = new ListNode(r);
            l4curr = l4curr.next;
            l1curr = l1curr.next;
        }
        while(l2curr != null){
            int n = l2curr.val + 0 + c;
            int r = n%10;
            c = n/10;
            l4curr.next  = new ListNode(r);
            l4curr = l4curr.next ;
            l2curr = l2curr.next;
        }
        if(c != 0) {
            l4curr.next  = new ListNode(c);
        }
        return l3curr.next;
        // int n1 = 0;
        // int n2 = 0;
        // while(l1curr != null){
        //      n1 = (n1 * 10) + l1curr.val;
        //     l1curr = l1curr.next;
        // }
        // int n11 = 0;
        // while(n1 != 0){
        //     int n = n1 %10;
        //     n11  = (n11  * 10) + n;
        //     n1 = n1 / 10;
        //     }

        // System.out.println(n11);
        // while(l2curr != null){
        //      n2 = (n2 * 10) + l2curr.val;
        //     l2curr = l2curr.next;
        // }
        // int n22 = 0;
        // while(n2 != 0){
        //     int n = n2 %10;
        //     n22  = (n22  * 10) + n;
        //     n2 = n2 / 10;
        //     }
        // System.out.println(n22);
        // int sum = 0;
        //  sum = n11 + n22;
         
        // ListNode l3curr = new ListNode(0);
        // if(sum == 0) return l3curr;
        // ListNode l4curr = l3curr;
        //  while(sum != 0){
        //     int n = sum %10;
        //     sum = sum / 10;
        //     l4curr.next  = new ListNode(n);
        //     l4curr = l4curr.next ;
        //  }
         //if(sum == 0) return l3curr;
        // return l3curr.next;
    }
}

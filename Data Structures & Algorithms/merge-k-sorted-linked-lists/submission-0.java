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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length <= 0)
         return null;
        ListNode newL = lists[0];
        ListNode newL2 = newL;
        for (int i = 1; i < lists.length; i++) {
            ListNode curr = lists[i];
            ListNode curr2 = newL2;
            ListNode sortedInternal = new ListNode(0);
            ListNode sortedInternal2 = sortedInternal;
            while (curr != null && curr2 != null) {
                // System.out.println(curr.val);
                // System.out.println(curr2.val);
                // System.out.println("a----------------a");
                // ListNode temp = newL;
                if (curr.val <= curr2.val) {
                    sortedInternal2.next = curr;
                    curr = curr.next;
                } else {
                    sortedInternal2.next = curr2;
                    curr2 = curr2.next;
                }
                sortedInternal2 = sortedInternal2.next;
            }

            if (curr != null) {
                sortedInternal2.next = curr;
            }
            if (curr2 != null) {
                sortedInternal2.next = curr2;
            }           
            newL2 = sortedInternal.next;
            newL =newL2;
        }
        return newL;
    }
}
// ListNode test = sortedInternal.next;
            // while(test != null){
            // System.out.println(test.val);
            // test = test.next;
            // }
// ListNode temp = curr.next;
// curr.next = curr2;
// ListNode temp2 = curr2.next;
// curr2.next = temp;
// curr = temp;
// curr.next = temp2;
// curr2 = temp2;
// System.out.println("in else");
// curr2 = curr.next;
// curr = curr.next;

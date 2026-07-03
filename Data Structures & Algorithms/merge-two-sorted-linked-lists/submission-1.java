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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       return solve(list1,list2);
    }
    public ListNode solve(ListNode cur1, ListNode cur2) {
        if(cur1 == null){
           // cur1.next = cur2;
            return cur2;
        }
        if(cur2 == null){
           // cur2.next = cur1;
            return cur1;
        }
       
        // ListNode h = 
        if(cur1.val <= cur2.val){
          cur1.next = solve(cur1.next,cur2);
         return cur1;
        }else{
          cur2.next = solve(cur1,cur2.next);
         return cur2;
        }
    }
}
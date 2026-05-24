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

        ListNode mergedList1 = new ListNode(0);
        ListNode mergedList = mergedList1;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1 != null && cur2 != null){
            int val1 = cur1.val;
            int val2 = cur2.val;
            if(val1 <= val2){
                mergedList.next = cur1;
                cur1 =cur1.next;
            }else{
                mergedList.next = cur2;
                cur2 =cur2.next;
            }
            mergedList = mergedList.next;
        }
        if(cur1 != null) mergedList.next = cur1;
        if(cur2 != null) mergedList.next = cur2;
        return mergedList1.next;
        
    }
}
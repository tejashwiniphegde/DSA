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
        ListNode list3 = new ListNode();
        ListNode ans = list3;
        while(list1!=null && list2!=null){
            int val1 = list1.val;
            int val2 = list2.val;
            if(val1<val2){
                ans.next = list1;
                list1=list1.next;
            }
            else{
                ans.next=list2;
                list2=list2.next;
            }
            ans=ans.next;
        }

        ans.next = list1==null? list2 : list1;
        return list3.next;
    }
}
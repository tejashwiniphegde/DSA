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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode prev = new ListNode(0,head);
        ListNode dum = prev;
        int count = 1;
        while(temp!=null && temp.next!=null){
            prev.next = temp.next;
            temp.next = temp.next.next;
            prev.next.next = temp;
            temp = temp.next;
            prev = prev.next.next;


            // prev.next = temp.next;
            // temp.next = prev;
            // prev = temp.next;
            // temp = prev.next;
        
        }
        return dum.next;
    }
}
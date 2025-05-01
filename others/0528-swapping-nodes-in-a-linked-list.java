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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 1;
        ListNode swap1 = null;
        ListNode swap2 = null;
        Stack<ListNode> stack = new Stack();
        while(temp!=null){
            if(count==k){
                swap1 = temp;
            }
            stack.push(temp);
            count++;
            temp=temp.next;
        }
        count = 1;
        while(count!=k){
            stack.pop();
            count++;
        }
        swap2 = stack.pop();
        int val = swap1.val;
        swap1.val  = swap2.val;
        swap2.val = val;
        return head;
    }
}
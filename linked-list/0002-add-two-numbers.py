# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        num1 = ''
        num2=''
        while l1:
            num1+=str(l1.val)
            l1=l1.next
        while l2:
            num2+=str(l2.val)
            l2=l2.next
        num1 = num1[::-1]
        num2 = num2[::-1]
        ans = int(num1)+int(num2)
        ans = str(ans)[::-1]
        lists = ListNode(ans[0])
        l3 = lists
        for i in ans[1:]:
            l = ListNode(i)
            l3.next = l
            l3 = l
        return lists



        

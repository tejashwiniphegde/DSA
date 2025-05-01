"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""
from collections import deque
class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        if not root: return None
        stack = deque([root])
        while(stack):
            next_val = None
            for _ in range(len(stack)):
                n = stack.popleft()
                n.next, next_val = next_val,n
                if n.left and n.right:
                    stack.extend([n.right,n.left])
        return root
            

        
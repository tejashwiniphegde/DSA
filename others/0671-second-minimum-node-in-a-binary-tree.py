# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def findSecondMinimumValue(self, root: Optional[TreeNode]) -> int:
        if not root or (not root.left and not root.right):
            return -1
        
        stack = deque([root])
        d = []
        while stack:
            node = stack.popleft()
            if root.val == node.val:
                if node.left:
                    stack.append(node.left)
                    stack.append(node.right)
            else:
                d.append(node.val)
        
        if not d:
            return -1
        return min(d)



            
        

        

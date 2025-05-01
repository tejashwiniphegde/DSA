# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        ans = None
        def ancestor(root):
            nonlocal ans
            nonlocal p,q
            if not root:
                return False
            if root.val == p.val or root.val == q.val:
                ans = root
                return True

            left = ancestor(root.left)
            right = ancestor(root.right)
            
            print(left,right)
            if left and right:
                ans = root
            else:
                return left or right
            
        ancestor(root)
        return ans

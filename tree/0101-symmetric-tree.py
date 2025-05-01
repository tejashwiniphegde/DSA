# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def check(left,right):
            if left and right:
                return left.val == right.val and check(left.left,right.right) and check(left.right,right.left)
            else:
                return left == right
        return check(root.left,root.right)


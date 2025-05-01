# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        isValid = check(root,float('-inf'),float('inf'))
        return isValid

def check(root,min,max):
    if root == None:
        return True
    if min is not None and root.val <= min:
        return False
    if max is not None and root.val >= max:
        return False
    return check(root.left,min,root.val) and check(root.right,root.val,max)

    
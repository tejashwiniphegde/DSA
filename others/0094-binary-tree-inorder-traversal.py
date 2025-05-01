# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        helper(root,res)
        return res

def helper(root,res):
    if root != None:
        helper(root.left,res)
        res.append(root.val)
        helper(root.right,res)
    else:
        return


          
        


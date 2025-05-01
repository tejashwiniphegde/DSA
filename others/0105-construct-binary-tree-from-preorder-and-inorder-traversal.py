# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        in_map = {inorder[i]: i for i in range(len(inorder))}
        def buildPartition(start,end):
            if (start>end or not preorder):
                return None
            
            root = TreeNode(preorder.pop(0))
            root_index = in_map[root.val]
            if root_index>(len(inorder)-1) or root_index<0:
                return None
            root.left = buildPartition(start,root_index-1)
            root.right = buildPartition(root_index+1,end)
            return root
        return buildPartition(0,len(inorder)-1)









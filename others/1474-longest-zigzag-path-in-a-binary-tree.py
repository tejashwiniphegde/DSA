# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def longestZigZag(self, root: Optional[TreeNode]) -> int:

        pathlen = 0
        def zigzag(root,direction,cur_path):
            nonlocal pathlen
            
            if root:
                pathlen = max(pathlen,cur_path)
                if direction == 'left':
                    zigzag(root.left,'right',cur_path+1)
                    zigzag(root.right,'left',1)
                else:
                    zigzag(root.right,'left',cur_path+1)
                    zigzag(root.left,'right',1)

            
            
            
            
        if root.right:
            zigzag(root.right,'left',1)
        if root.left:
            zigzag(root.left,'right',1)
        return pathlen

            


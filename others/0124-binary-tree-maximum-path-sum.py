# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        maxsum = -9999
        def path(root):
            nonlocal maxsum
            if not root:
                return 0
            
            left = path(root.left)
            right = path(root.right)
            if root.val>=0 and left<0 and right>=0:
                maxsum = max(maxsum,root.val+right)
            elif root.val>=0 and right<0 and left>=0:
                maxsum = max(maxsum,root.val+left)
            elif root.val>=0 and right<0 and left<0:
                maxsum = max(maxsum,root.val)
            elif root.val<0:
                if left>=0 and right>=0:
                    maxsum = max(maxsum,root.val+left+right)
                elif left<0 and right>=0:
                    maxsum = max(maxsum,root.val+right)
                elif left>=0 and right<0:
                    maxsum = max(maxsum,root.val+left)
                else:
                    maxsum = max(maxsum,root.val)
                return root.val + max(left,right,0)
            else:
                maxsum = max(maxsum,root.val+left+right)
            return root.val + max(left,right,0)



        path(root)
        return maxsum
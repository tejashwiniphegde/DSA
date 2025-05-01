# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        pathsum = 0
        nodes = 0
        present = False
        def dfs(root):
            nonlocal pathsum,targetSum,present,nodes
            if not root:
                return 
            pathsum+=root.val
            nodes+=1
            print(pathsum)
            if pathsum == targetSum and (not root.left and not root.right):
                print(pathsum)
                present = True
            if root.left:
                dfs(root.left)
            if root.right:
                dfs(root.right)
            pathsum-=root.val
            
            return present

        return dfs(root)


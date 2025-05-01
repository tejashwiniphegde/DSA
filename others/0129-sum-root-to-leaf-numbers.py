# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        total = 0
        def dfs(root,nodes):
            nonlocal total
            if not root:
                return
            nodes+=str(root.val)

            if root.left:
                dfs(root.left,nodes)
            if root.right:
                dfs(root.right,nodes)
            
            if not root.left and not root.right:
                total += int(nodes) if nodes else 0
                print(nodes)

        
        dfs(root,'')
        return total



            



    

            





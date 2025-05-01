# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def recoverTree(self, root: Optional[TreeNode]) -> None:
        prev= None
        first= None
        second=None
        
        def inorder(root):
            nonlocal prev,first,second
            if root == None:
                return 
            inorder(root.left)
            if prev!=None and prev.val>root.val:
                if first == None:
                    first = prev
                second = root
            prev = root
            inorder(root.right)


        inorder(root)
        first.val,second.val = second.val,first.val
    

    

        

        
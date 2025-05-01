# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def binaryTreePaths(self, root):
        if not root:
            return []
        self.res = []
        def paths(root,s):
            if not root.left and not root.right:
                s+=str(root.val)
                self.res.append(s)
            if root.left:
                paths(root.left,s+str(root.val)+'->')
            if root.right:
                paths(root.right,s+str(root.val)+'->')
        paths(root,'')
        return self.res

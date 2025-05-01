# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
        tree1 = inOrder(root1,[])
        tree2 = inOrder(root2,[])
        tree1.extend(tree2)
        return sorted(tree1)
    
def inOrder(root,order):
    if not root:
        return []
    inOrder(root.left,order)
    order.append(root.val)
    inOrder(root.right,order)
    return order

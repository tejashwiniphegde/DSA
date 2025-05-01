# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def generateTrees(self, n: int) -> List[Optional[TreeNode]]:
        lists = constructTrees(1,n)
        return lists


def constructTrees(start,end):
    lists = []
    if(start>end):
        lists.append(None)
        return lists

    for i in range(start,end+1):
        leftSubTree = constructTrees(start,i-1)
        rightSubTree = constructTrees(i+1,end)

        for j in range(len(leftSubTree)):
            left = leftSubTree[j]
            for k in range(len(rightSubTree)):
                right = rightSubTree[k]
                node = TreeNode(i,left,right)
                lists.append(node)
    return lists

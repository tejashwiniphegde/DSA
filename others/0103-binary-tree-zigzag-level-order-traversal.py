# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        levels = [[root.val]]
        temp = deque()
        Q = deque([(root,0)])
        zig = 0

        while Q:
            node,l = Q.popleft()
            l+=1
            if node.left : temp.append((node.left,l))
            if node.right : temp.append((node.right,l))

            if not Q:
                if temp:
                    t = []
                    for n in temp:
                        t.append(n[0].val)
                        l = n[1]
                    if l%2 != 0:
                        t.reverse()
                    levels.append(t)
                    Q=temp
                    temp = deque()

        return levels

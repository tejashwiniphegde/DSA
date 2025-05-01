# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:
    def serialize(self, root: Optional[TreeNode]) -> str:
        serial=''
        def encode(root):
            nonlocal serial
            if not root:
                return serial
            serial+=str(root.val)+' '
            encode(root.left)
            encode(root.right)
        encode(root)
        return serial
        
    
    def deserialize(self, data: str) -> Optional[TreeNode]:
        values = collections.deque(int(i) for i in data.split())
        def build(minval,maxval):
            if values:
                if minval<values[0]<maxval:
                    val = values.popleft()
                    node = TreeNode(val)
                    node.left = build(minval,val)
                    node.right = build(val,maxval)
                    return node

        return build(float('-inf'),float('inf')) 
        



                
        

# Your Codec object will be instantiated and called as such:
# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# tree = ser.serialize(root)
# ans = deser.deserialize(tree)
# return ans
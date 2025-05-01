/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            h.put(inorder[i],i);
        }
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1,h);
    }

    public TreeNode build(int[] inorder,int[] postorder,int inStart, int inEnd, int postStart, int postEnd, HashMap<Integer,Integer>h){
        if(inStart>inEnd || postStart>postEnd){
            return null;
        }

        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = h.get(rootVal);
        int leftSize = rootIndex - inStart;
        root.left = build(inorder,postorder,inStart,rootIndex-1,postStart,postStart+leftSize-1,h);
        root.right = build(inorder,postorder,inStart+leftSize+1,inEnd,postStart+leftSize,postEnd-1,h);
        return root;
    }
}
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        dfs(root,depth,1,val);
        return root;
    }

    public void dfs(TreeNode root,int depth,int i, int val){
        if(root==null){
            return;
        }
        if(i==depth-1){
          TreeNode left = root.left;
          TreeNode right = root.right;
          root.left = new TreeNode(val);
          root.right = new TreeNode(val);
          root.left.left = left;
          root.right.right = right;
          return;
        }
        dfs(root.left,depth,i+1,val);
        dfs(root.right,depth,i+1,val);
    }
}
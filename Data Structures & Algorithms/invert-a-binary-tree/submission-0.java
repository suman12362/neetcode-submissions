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
    public TreeNode invertTree(TreeNode root) {
        
        TreeNode n = invert(root);
        return n;
    }
    public TreeNode invert(TreeNode root){
        if(root == null) return root;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
         TreeNode nd = que.poll();
         TreeNode temp = nd.left;
         nd.left = nd.right;
         nd.right = temp;
         if(nd.left != null) que.add(nd.left);
         if(nd.right != null) que.add(nd.right);
        }
        return root;

    }
}

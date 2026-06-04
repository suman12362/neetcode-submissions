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
    int s = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return s;
    }
    public int dfs(TreeNode curr){
        if(curr == null) return 0;
        // if(curr.left == null && curr.right == null) {
        // return curr.val;
        // }
        System.out.println(curr.val);
         int leftmax = dfs(curr.left);
         //System.out.println(curr.val);
       int rightmax = dfs(curr.right);
       leftmax = Math.max(leftmax,0);
       rightmax = Math.max(rightmax,0);
        s = Math.max(s,curr.val+leftmax+rightmax);
        return Math.max(leftmax,rightmax) + curr.val;
    }
}

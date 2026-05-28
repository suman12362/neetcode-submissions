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
    int d =0;
    public boolean isBalanced(TreeNode root) {
        
        findbtree(root);
        if(d<=1)
        return true;
        else return false;
    }
    public int findbtree(TreeNode root){

        if(root == null) return 0;
        int l = findbtree(root.left);
        int r = findbtree(root.right);
        // System.out.println("val "+root.val);
        // System.out.println("l "+l);
        // System.out.println("r "+r);
        // System.out.println("x--------------x");
       // int x = Math.abs(l-r);
       d = Math.max(d,Math.abs(l-r));
       // System.out.println(x);
        return 1 +(Math.max(l,r));
    }
}

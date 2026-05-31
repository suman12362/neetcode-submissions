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
       int tot = 0;
      // int max = 0;
    public int goodNodes(TreeNode root) {
        helper(root,root.val);
        return tot;
    }

    public void helper(TreeNode curr,int max) {
      if(curr !=null){
         max = Math.max(max,curr.val);
         System.out.println(max);
        if(curr.val >= max) tot++;
        //max =curr.val;
      helper(curr.left,max);
      //max = Math.max(max,curr.val);
      //max =curr.val;
      helper(curr.right,max);
      //max =curr.val;
      }
     // return 0;
    }
}

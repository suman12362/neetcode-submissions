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
  List<Integer> ls = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        
        if(root == null)
         return -1;
        bstHelper(root);
        return ls.get(k-1);
    }

    public void bstHelper(TreeNode node){
      if(node != null){
        bstHelper(node.left);
        ls.add(node.val);
        bstHelper(node.right);
      }
    }
}

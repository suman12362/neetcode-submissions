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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      HashMap<Integer,Integer> hs = new HashMap<>();
      for(int i = 0;i<inorder.length;i++){
        hs.put(inorder[i],i);
      }
      List<Integer> inor = new ArrayList<>();
      for(int a : inorder){
        inor.add(a);
      }
      TreeNode root =helper(hs,preorder,0,0,inorder.length-1);

        return root;
    }
    public TreeNode helper(HashMap<Integer,Integer> hs, int[] preorder,int i,int li,int ri) {
      if(li>ri){
        return null;
      }
          TreeNode curr = new TreeNode(preorder[i]);
          int m = hs.get(curr.val);
          curr.left = helper(hs,preorder,i+1,li,m-1);
          curr.right= helper(hs,preorder,i+1+(m-li),m+1,ri);
    return curr;
}
}

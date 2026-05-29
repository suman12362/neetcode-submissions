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
    public boolean isValidBST(TreeNode root) {
      if(root == null) return false;
       // List<Integer> b = 
       verifyBst(root);
        System.out.println(ls.size());
        for(int i = 0;i<ls.size()-1;i++){
          System.out.println(ls.get(i)+" sum "+ls.get(i+1));
          if(ls.get(i) >= ls.get(i+1)){
          return false;
          }
        }
        return true;
    }

    public void verifyBst(TreeNode root){
     // if(root == null || root.left == null || root.right == null) return false;
     // if((root.left).val > root.val) return false;
     if(root != null) {
    //  return null;
     //List<Integer> ls = new ArrayList<>();
     //if(root != null){
      verifyBst(root.left);
      ls.add(root.val);
     // System.out.println(root.val);
      //if((root.right).val < root.val) return false;
      verifyBst(root.right);}
     // return true;
    //}
    //return ls;
    }
}

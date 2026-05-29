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
    public List<Integer> rightSideView(TreeNode root) {
      

      if(root == null) return new ArrayList<>();

      Queue<TreeNode> que = new LinkedList<>();
      que.add(root);
      List<Integer> list = new ArrayList<>();
      while(true){
      int listCount = que.size();
      if(listCount == 0)
      return list;

      while(listCount>0){

        TreeNode node = que.poll();
        if(node.left != null){
          que.add(node.left);
        }
        if(node.right != null){
          que.add(node.right);
        }
        if(listCount == 1)
        list.add(node.val);
        listCount--;
      }
      } 
    }
}

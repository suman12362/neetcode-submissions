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
    public List<List<Integer>> levelOrder(TreeNode root) {
     // if(root == null) return 

      Queue<TreeNode> que = new LinkedList<>();
      List<List<Integer>> mainList = new ArrayList<>();
      List<Integer> subList = new ArrayList<>();
      if(root == null)
       return mainList;

      que.add(root);
      
      subList.add(root.val);
      
      while(true){
        
      int listCount = que.size();
      if(listCount <= 0)
       return mainList;

       mainList.add(subList);

      subList = new ArrayList<>();
      while(listCount>0){
        TreeNode node = que.poll();

        if(node.left != null){
         que.add(node.left);
         subList.add((node.left).val);
        }
        if(node.right != null){
          que.add(node.right);
          subList.add((node.right).val);
        }
        listCount--;
      }
    }
        
    }
}

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
    public int maxDepth(TreeNode root) {
        int count = bfstraverse(root);
        return count;
    }
    public int bfstraverse(TreeNode root){
        if(root == null)
        return 0;
       //int count =1;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int count =-1;
        while(true){
        int levelSize = que.size();
        if(levelSize == 0) return count+1;
        while(levelSize>0){
           TreeNode popRoot = que.poll();
           if(popRoot.left != null) {
            que.add(popRoot.left);
            }
           if(popRoot.right != null) {
            que.add(popRoot.right);
            }
            levelSize--;
          // count++;
        }
        count++;
        System.out.println(count);
        }
        // Stack<TreeNode> stk = new Stack<>();
        // stk.push(root);
        // int max =1;
        // while(!stk.isEmpty()){
        //    TreeNode popRoot = stk.pop();
        //    if(popRoot.left != null) stk.push(popRoot.left);
        //    if(popRoot.right != null) stk.push(popRoot.right);
        //    System.out.println(stk.size());
        //    if(stk.size() > max){
        //     System.out.println("in");
        //    max = stk.size();}
        //    //count++;
        // }
       // return count;
    }
}

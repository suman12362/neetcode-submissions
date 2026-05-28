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
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return d;
    }
    // public int findDia(TreeNode root) {
        
     public int findDia(TreeNode root) {
        if(root == null) return 0;

        int l = findDia(root.left);
      //  System.out.println("l "+l);

        int r = findDia(root.right);
        //System.out.println("r "+r);
        System.out.println("r-------------------l");
       //System.out.println("d "+ (l+r)); 
        d = Math.max(d, l+r);
        System.out.println("d "+ Math.max(d, l+r)); 
        System.out.println("lr "+ (1+ Math.max(l,r))); 
           return  1 + Math.max(l,r); 
          
        }
     
    }


// Stack<TreeNode> stk = new Stack<>();
        // stk.push(root);
        // while(!stk.isEmpty()){
            
        //     TreeNode nd = stk.pop();
        //     System.out.println(nd.val);
        //     if(nd.right != null ) stk.push(nd.right);
        //     if(nd.left != null ) stk.push(nd.left);
            //System.out.println(nd.val);
            //if(nd.right != null ) stk.push(nd.right);
           //System.out.println(nd.val);
            
            
            //if(!stk.isEmpty()){
            //System.out.println(stk.peek().val);
            //}

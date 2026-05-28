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
    boolean b = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
     //boolean bool = traverse(p,q);
     traverse(p,q);
     return b;
        
    }
    public void traverse(TreeNode p, TreeNode q){

        if((p == null && q !=null) || (p != null && q ==null)){
            b = false;
        }
        // if (p == null || q == null) b = false;

    if(p != null && q !=null){
    traverse(p.left,q.left); 
    //traverse(q.left); 
    System.out.println(p.val); 
    System.out.println(q.val); 
    System.out.println("x--------------x"); 
     if(p.val != q.val) {
     b = false;}
    
    traverse(p.right,q.right); 
    //traverse(q.right);
    }
   // return true;
}
}

 //     if(p == null && q == null) return true;

    //     Queue<TreeNode> que1 = new LinkedList<>();
    //     Queue<TreeNode> que2 = new LinkedList<>();
    //     que1.add(p);
    //     que2.add(q);
    //     while(!que1.isEmpty() && !que2.isEmpty()){
    //      TreeNode v1 = que1.poll();
    //      TreeNode v2 = que2.poll();
    //      if(v1.val != v2.val) return false;
    //      if(v1.left != null) que1.add(v1.left);
    //      if(v1.right != null) que1.add(v1.right);
    //      if(v2.left != null) que2.add(v2.left);
    //      if(v2.right != null) que2.add(v2.right);
    //     }
    //     if(!que1.isEmpty() || !que2.isEmpty()) return false;
    //   return true;

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

    //boolean b = true;
    // List<Integer> a = new ArrayList<>();
    // List<Integer> b = new ArrayList<>();
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
  //     if(root.left == null || root.right == null || subRoot.left == null || subRoot.right == null)
  //  return false;
      String s1 = findSubtree(root);
      String s2 = findSubtree(subRoot);
      boolean b = s1.contains(s2);
      //int i =0;
     // int j = 0;
     System.out.println(s1);
      System.out.println(s2);
    //  System.out.println(b.size());
      // for(int i =0,j=0;i<a.size(); i++){
        
      //   System.out.println(a.get(i) +" is "+ b.get(j));
      //   if(a.get(i) == b.get(j)){
      //     j++;
      //     //System.out.println(j +" j vs "+ b.size());
      //     if(j == b.size())
      //     { return true;}
      //   }else{
      //     j = 0;
      //   }
      // }
      return b;
    }

     public String findSubtree(TreeNode p) {
      if(p == null) return null;
      StringBuilder sb = new StringBuilder("^");

      if(p != null){
        
       // a.add(p.val);
       sb.append(p.val);
      sb.append(findSubtree(p.left));
      sb.append(findSubtree(p.right));
     //System.out.println(sb);
     // a.add(p.val);
     }
     return sb.toString();
     }
    //  public String findSubtree2(TreeNode q) {
    //   if(q == null) return null;
    //    StringBuilder sb = new StringBuilder("^");
    //   if(q != null){
       
    //    // a.add(p.val);
    //    sb.append(q.val);
    //   sb.append(findSubtree(q.left));
    //   sb.append(findSubtree(q.right));
    //   //System.out.println(sb);
    //   }
    //   return sb.toString();
    //  }
    // public boolean findSubtree(TreeNode root, TreeNode subRoot) {

    // //   if((root == null && subRoot != null) || (root != null && subRoot == null)){
    // //     b = false;
    // //   }
    //      if(root == null) return false;
    //        Queue<TreeNode> que = new LinkedList<>();
    //        que.add(root);
    //   while(!que.isEmpty()){
    //        TreeNode node = que.poll();
    //        boolean top = false;
    //        boolean left = false;
    //        boolean right = false;
    //        if(node.val == subRoot.val){
    //         top = true;
    //        }
    //        if(node.left != null){
    //         que.add(node.left);
    //         if(((node.left).val) == (subRoot.left).val)
    //         {
    //           left = true;  
    //         }
    //        }
    //        if(node.right != null){
    //         que.add(node.right);
    //         if(((node.right).val) == (subRoot.right).val)
    //         {
    //           right = true;  
    //         }
    //        }
    //        if(top ==true && left ==true && right ==true){
    //         return true;
    //        }

    //     //  findSubtree(root.left,subRoot);
    //     //  System.out.println(root.val);
    //     //  findSubtree(root.right,subRoot);
         
    //   }
    //   return false;
    // }

}

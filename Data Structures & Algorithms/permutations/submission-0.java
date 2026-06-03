class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backTrack(nums,res,path);
        return res;
    }
    public void backTrack(int[] nums,List<List<Integer>> res,List<Integer> path) {
       
       if(path.size()>= nums.length){
        res.add(new ArrayList<>(path));
        return;
       }
       for(int i = 0;i<nums.length;i++){
        if(path.contains(nums[i]))
        continue;
         path.add(nums[i]);
         backTrack(nums,res,path);
         path.remove(path.size()-1);
         //backTrack(nums,res,path);
       }
    //   // System.out.println(path);
    //    path.add(nums[i]);
    //    System.out.println(path);
    //    backTrack(nums,res,path,i+1);
    // //    System.out.println(path);
    //    path.remove(path.size()-1);
    //    backTrack(nums,res,path,i+1);
    }
}

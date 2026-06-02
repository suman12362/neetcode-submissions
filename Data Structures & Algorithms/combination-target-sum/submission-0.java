class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backTrack(res,path,nums,target,0,0);
        return res;
    }

    public void backTrack(List<List<Integer>> res,List<Integer> path,int[] nums, int target,int i,int tot){
     
     if(tot == target){
        res.add(new ArrayList<>(path));
        return;
     }
     if(i>= nums.length || tot > target){
        return;
     }
     path.add(nums[i]);
     //System.out.println(path);
     backTrack(res,path,nums,target,i,tot +nums[i]);
     path.remove(path.size()-1);
     backTrack(res,path,nums,target,i+1,tot);
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backTrack(0,res,path,nums);
        return res;
    }
    public void backTrack(int s,List<List<Integer>> res,List<Integer> path,int[] nums){
        if(s == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[s]);
        backTrack(s+1,res,path,nums);
        path.remove(path.size()-1);
        backTrack(s+1,res,path,nums);
    }
}

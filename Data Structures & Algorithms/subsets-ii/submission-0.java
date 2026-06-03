class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums,res,path,0);
        return res;
    }
    public void backTrack(int[] nums,List<List<Integer>> res,List<Integer> path,int i) {
        if(i>= nums.length){
            if(!res.contains(path))
            res.add(new ArrayList(path));
            return;
        }
        path.add(nums[i]);
        backTrack(nums,res,path,i+1);
        path.remove(path.size()-1);
        backTrack(nums,res,path,i+1);
    }
}

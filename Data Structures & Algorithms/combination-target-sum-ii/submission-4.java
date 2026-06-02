class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(res,path,candidates,target,0,0);
        return res;
    }
    private void backTrack(List<List<Integer>> res,List<Integer> path,int[] candidates,int target,int i,int tot){
        if(tot == target && !res.contains(path)){
            res.add(new ArrayList<>(path));
            return;
        }
        //ints += candidates[s];
        if(i >= candidates.length || tot > target){
            return;
        }
       // if(!path.contains(candidates[i])){
       
        path.add(candidates[i]);
        backTrack(res,path,candidates,target,i+1, tot + candidates[i]);
        
         path.remove(path.size() -1);
         while(i+1 < candidates.length && candidates[i] == candidates[i + 1]){
        i++;
       }
        backTrack(res,path,candidates,target,i+1,tot);
        //}
    }
}

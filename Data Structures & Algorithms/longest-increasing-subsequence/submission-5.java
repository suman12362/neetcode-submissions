class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer[][] memo = new Integer[nums.length+1][nums.length+1];
        //for(int i =0;i<memo[i];i++)
        
        return solve(0,-1,nums,nums.length,memo);
    }
    public int solve(int i, int p,int[] nums,int n,Integer[][] memo) {
        if(i== n){
            return 0;
        }
        if(p != -1 && memo[i][p] != null){
            return memo[i][p] ;
        }
        int take =0;
        if(p == -1 || nums[i]>nums[p]){
             take = 1+ solve(i+1,i,nums,nums.length,memo);
        }
        int skip = solve(i+1,p,nums,nums.length,memo);
        if(p != -1)
        memo[i][p] = Math.max(take,skip);
        return Math.max(take,skip);
    }
}

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2 != 0)
        return false;
        Boolean[][] memo = new Boolean[nums.length+1][sum+1];
        //Arrays.fill(memo,-1);
        return solve(0,sum/2,nums,memo);
    }
    public boolean solve(int i,int sum,int[] nums,Boolean[][] memo){
        if(sum ==0){
            return true;
        }
        if(i == nums.length || sum<0){
            return false;
        }
        if(memo[i][sum] != null){
            return memo[i][sum];
        }
        if(sum < nums[i]){
            return solve(i+1,sum,nums,memo);
        }
        
        
        boolean pick = solve(i+1,sum-nums[i],nums,memo);
        boolean skip = solve(i+1,sum,nums,memo);
        //return (pick ||skip);
         return memo[i][sum] = (pick ||skip);
    }
}

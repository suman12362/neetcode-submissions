class Solution {
    public int maxCoins(int[] nums) {
        int[] newNums = new int[nums.length + 2];
        Arrays.fill(newNums, 1);
        for (int i = 1; i < newNums.length - 1; i++) {
            newNums[i] = nums[i - 1];
        }
        Integer[][] memo = new Integer[newNums.length+1][newNums.length+1];
        return solve(1,nums.length,1, newNums, newNums.length,memo);
    }
    public int solve(int i,int j, int k, int[] nums, int n,Integer[][] memo) {
        if (i>j || k>j)
        return 0;
        if(memo[i][j] != null)
        return memo[i][j];
        int take = (nums[i - 1] * nums[k] * nums[j + 1]) + solve(k+1,j,k+1, nums, nums.length,memo) + solve(i,k-1,i, nums, nums.length,memo);
        int nextChoice = solve(i,j,k+1, nums, nums.length,memo);
        return memo[i][j] = Math.max(nextChoice, take);
    }
}

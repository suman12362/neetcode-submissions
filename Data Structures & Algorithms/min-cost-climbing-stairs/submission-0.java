class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length+1];
        Arrays.fill(memo,-1);
        int c = climb(cost,cost.length,memo);
        return c;
    }
    public int climb(int[] cost,int n,int[] memo) {
        if(n == 1 || n==0)
        return 0;
        if(memo[n] != -1)
        return memo[n];
        memo[n] = Math.min(cost[n-1]+ climb(cost,n-1,memo), cost[n-2]+ climb(cost,n-2,memo));
        return memo[n];
    }
}

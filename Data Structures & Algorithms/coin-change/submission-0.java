class Solution {
    public int coinChange(int[] coins, int amount) {
        int z = 0;
        System.out.println(z);
        int[] memo = new int[amount+1];
        Arrays.fill(memo,-1);
        int res = solve(coins,amount,0,memo);
        if(res != Integer.MAX_VALUE)
        return res;
        return -1;
    }
    public int solve(int[] coins, int amount,int z,int[] memo) {
        
        if(amount == 0){
         return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }
        if(memo[amount] != -1){
            return memo[amount];
        }
         int min = Integer.MAX_VALUE;
        for(int i =0;i<coins.length;i++){
           int ans = solve(coins,amount - coins[i],z+1,memo);
            if(ans != Integer.MAX_VALUE){
            min = Math.min(min,1+ans);
        }
        }
       memo[amount] = min;
        return min;
       
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int profit = 0;
        while(j<prices.length){
            int pl =prices[j] - prices[i];
           if(pl > 0){
            profit = profit < pl ? pl:profit;
            j++;
           }
           else if(pl <= 0){
            i = j;
            j++;;
           }
        }
        return profit;
    }
}

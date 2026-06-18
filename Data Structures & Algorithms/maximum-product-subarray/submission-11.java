class Solution {
    public int maxProduct(int[] nums) {
        
        int cur_sum = 1;
        int max_sum = Integer.MIN_VALUE;
        for( int i =0;i<nums.length;i++){
            cur_sum *= nums[i];
            max_sum = Math.max(max_sum,cur_sum);
            if(cur_sum==0)
            cur_sum =1;
        }

        cur_sum = 1;
    for(int i = nums.length - 1; i >= 0; i--) {
        cur_sum *= nums[i];
        max_sum = Math.max(max_sum, cur_sum);
        
        if(cur_sum == 0) {
            cur_sum = 1;
        }
    }
        return max_sum;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int multipler = 1;
        res[0] = 1;
        for(int i = 0; i< nums.length-1;i++)
        {
           multipler = multipler * nums[i];
           res[i+1] = multipler;
        }
        int mul2 = 1;
        for(int i = nums.length-1; i> 0;i--){
          mul2  = mul2 * nums[i];
          res[i-1] = res[i-1] * mul2;
        }
        System.out.print(Arrays.toString(res));
        return res;
    }
    
}  

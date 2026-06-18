class Solution {
    public int rob(int[] nums) {
      HashMap<Integer,Integer> hs = new HashMap<>();
        int max = robm(nums,nums.length,hs);
        
        return max;
    }
    public int robm(int[] nums,int n,HashMap<Integer,Integer> hs) {
      if(n == 1)
      return nums[0];
      if(n == 2)
      return Math.max(nums[0],nums[1]);

      if(hs.containsKey(n)){
        return hs.get(n);
      }
      int val = Math.max((robm(nums,n-2,hs) + nums[n-1]),robm(nums,n-1,hs));
       hs.put(n,val);
      return val;
    }
}

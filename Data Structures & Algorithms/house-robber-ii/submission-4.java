class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
        return nums[0];
      HashMap<Integer,Integer> hs = new HashMap<>();
      HashMap<Integer,Integer> hs1 = new HashMap<>();
      int[] a = Arrays.copyOfRange(nums,1,nums.length);
      int[] b = Arrays.copyOfRange(nums,0,nums.length-1);
       return Math.max(robm(a,nums.length-1,hs) , robm(b,nums.length-1,hs1));
    }
    public int robm(int[] nums,int n,HashMap<Integer,Integer> hs) {
      if(n==0)
      return 0;
      if(n == 1)
      return nums[0];
    //   if(n == 2)
    //   return Math.max(nums[0],nums[1]);
      // if(n == 3)
      // return Math.max(nums[1],Math.max(nums[0],nums[1]));

      if(hs.containsKey(n)){
        return hs.get(n);
      }
        int val = Math.max((robm(nums,n-2,hs) + nums[n-1]),(robm(nums,n-1,hs)));
        hs.put(n,val);
      return val;
    }
}

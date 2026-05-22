class Solution {
    public int longestConsecutive(int[] nums) {
    
     HashSet hs = new HashSet<>();
      for(int i = 0;i<nums.length;i++){
        hs.add(nums[i]);
      }
      int max = 0;
       for(int i = 0;i<nums.length;i++){
        int length = 0;
         if(!hs.contains(nums[i]-1)){
            int start = nums[i];
           while(hs.contains(start)){
             length++;
             start++;
           }
         }
         if(max<length) max=length;
       }
       return max;
    }
}

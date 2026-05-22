class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lls = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j=i+1;
            int k= nums.length-1;
            List<Integer> ls = new ArrayList<>();
          while(j<k){
            int sum = nums[i] + nums[j] +nums[k];
             if(sum == 0){
               lls.add(List.of(nums[i],nums[j],nums[k]));
               while(j <k && nums[j] == nums[j + 1]){
                j++;
               }
               while(j<k &&nums[k] == nums[k -1]){
                k--;
               }
               j++;k--; 
              // lls.add(ls);
             }
             else if(sum > 0){
                k--;
             }else{
                j++;
             }
            
          }
        //    if(nums[i] + nums[j] +nums[k] == 0){
        //        // ls.addAll(List.of(nums[i],nums[j],nums[k]));
        //         lls.add(ls);
        //      }
        }
        return lls;
        
    }
}

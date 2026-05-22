class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        for(int i = 0; i< nums.length -1;i++)
        {
            for(int j = i+1; j< nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
*/
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        for(int i= 0;i<nums.length;i++){
           int com = target - nums[i];
           if(!hs.containsKey(com)){
            hs.put(nums[i],i);
           }
           else{
            int[] arr = {hs.get(com),i};
            return arr;
           }
        }
        return null;
    }
}

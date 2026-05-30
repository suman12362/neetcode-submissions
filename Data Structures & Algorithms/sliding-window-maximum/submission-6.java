class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

      Deque<Integer> dq = new LinkedList<>();
      int[] arr = new int[nums.length - k +1];
      dq.offerLast(0);
      for(int i = 1;i<k;i++){
        while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
          dq.pollLast();
          //dq.offerLast(i);
          // System.out.println("inside1");
        }
        dq.offerLast(i);
      }
       arr[0] = nums[dq.peekFirst()];
      for(int i = 1,j=k;j<nums.length;i++,j++){
        
        if(dq.peekFirst() == i-1){
          dq.pollFirst();
        }
        while(!dq.isEmpty() && nums[dq.peekLast()] < nums[j]){
          dq.pollLast();
         // dq.offerLast(j);
         // System.out.println(nums[dq.peekLast()] +" inside2 "+nums[j]);
        }
        dq.offerLast(j);
         arr[i] = nums[dq.peekFirst()];
      }
      // System.out.println(nums[dq.peekFirst()]);
      // System.out.println(nums[dq.peekLast()]);
      return arr;
    }
}


  
    //     if(k>nums.length)  return null;
    //     int output[] = new int[nums.length - k +1];
    //      int x = 0;
    //   // x++;
    //   System.out.println(nums.length);
    //     for(int i=0,j = k;j<=nums.length;i++, j++){
    //       System.out.println(i +" ss "+ j);
    //       int[] subn = Arrays.copyOfRange(nums,i,j);
    //       System.out.println(Arrays.toString(subn));
    //       int max = helper(subn);
    //       // sum = sum - nums[j-k] + nums[j];
    //        output[x] = max;
    //        x++;
    //     }
    //     return output;
    // }

    // public int helper(int[] nums){
      
    //   System.out.println(nums.length);
    //     int max = nums[0];
    //     //int x = 0;
    //     for(int i= 0;i< nums.length; i++){
    //       max = Math.max(max,nums[i]);
    //     }
    //     //output[x] = max;
    //     return max;
    // }

class Solution {
    public int findMin(int[] nums) {
        
        int l =0;
        int r = nums.length-1;
        // if(nums[l]> nums[r] && r == 1){
        //     return nums[r];
        // }
        //if(nums[l]> nums[r]){
        System.out.println(" len "+ r);
        while(l<r){//3<5 =t,3<=4 =t
          int m = (l+r)/2;//2,4,3
          System.out.println(l +"  indsie "+ r);
          System.out.println(m);
          if(nums[m] > nums[r]){//5>3 =t,1>=6 =f,6>=6 =t
            l = m+1;//2+1=3, 3+1 =4
          }else{
            r = m;//5-1=4
          }
        //   else{
        //     return nums[0];
        //    // break;
        //   }
        }
        return nums[l];

    }
    
}

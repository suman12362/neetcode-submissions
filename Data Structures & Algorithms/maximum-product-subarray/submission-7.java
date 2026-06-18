class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0)
        return 0;
        if(nums.length == 1)
        return nums[0];
        if(nums.length == 2)
        return Math.max(nums[0],Math.max(nums[1],nums[0]*nums[1]));
        int len = nums.length;
        int[][] mat = new int[len][len];
        int max = Integer.MIN_VALUE;
        for(int i =0;i<len;i++){
            Arrays.fill(mat[i],Integer.MIN_VALUE);
        }
        for(int i =0;i<len;i++){
            mat[i][i] = nums[i];
        }

        for(int L=2;L<=len;L++){
            for(int i = 0;i<len-L+1;i++){
                
               int j = i+L-1;
               //System.out.println(mat[i][j]);
               mat[i][j] = nums[j] * mat[i][j-1];
               max = Math.max(max,mat[i][j]);
            }
        }
        int m = Integer.MIN_VALUE;
      for(int i =0;i<len;i++){
            for(int j = 0;j < len;j++){
                if(mat[i][j] > m)
                m= mat[i][j];
            }
        }
        
        return m;
    }
}

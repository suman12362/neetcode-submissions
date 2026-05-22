class Solution {
    public int trap(int[] height) {
        
        int area = 0;
        /*
        for(int i = 0,j=i+2;j<height.length;){
            System.out.println("i "+i + " has val " + height[i]);
            System.out.println("j " +j + " has val " + height[j]);
            int ld = height[i] - height[i+1];
            int rd = height[j] - height[j-1];
            System.out.println(ld);
            System.out.println(rd);
           if(ld >0 && rd >0){
            System.out.println("area1 " + area);
            area += (Math.min(height[i], height[j])) * (j-i-1);
            System.out.println("min " + (Math.min(height[i], height[j])));
            System.out.println("mul " + (j-i-1));
            System.out.println("area " + area);
            i = j;
            j = j+2;
           }
          else if(ld >0 && rd <= 0){

            j++;
          }
          else if(ld < 0){
            i++;
            j++;
          }
        }*/
        int i = 0;
        int j = height.length-1;
         int maxLeft = height[0];
         int maxRight = height[height.length-1];
        while(i<j){
          if(height[i] <= height[j]){
            if(maxLeft -  height[i] >0 )
            area = area + (maxLeft -  height[i]);
            maxLeft = maxLeft < height[i]? height[i]:maxLeft;
            
             i++;
             }
             else if(height[i] > height[j]){
              if(maxRight -  height[j] >0 )
            area = area + (maxRight -  height[j]);  
            maxRight = maxRight < height[j]? height[j]:maxRight;
            j--;
             }
        }
        return area;
    }
}

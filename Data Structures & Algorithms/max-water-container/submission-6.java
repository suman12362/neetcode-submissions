class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int j= heights.length-1;
        int area = 0;
        while(i<j){
            int curA = Math.min(heights[i], heights[j]) * (j-i);
            if(area < curA) area= curA;
            if(heights[i] <= heights[j]) {i++;}
            else if(heights[i] > heights[j]) {j--;}
       
        }
        return area;
    }
}

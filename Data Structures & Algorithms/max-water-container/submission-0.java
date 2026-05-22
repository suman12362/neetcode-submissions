class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int j= heights.length-1;
        int area = 0;
        while(i<j){
            System.out.println("i" +heights[i]);
            System.out.println("j" +heights[j]);
            int curA = Math.min(heights[i], heights[j]) * (j-i);
            if(area < curA) area= curA;
            if(heights[i] <= heights[j]) {i++;}
            else if(heights[i] > heights[j]) {j--;}
        // if(heights[i] > heights[j] && area < heights[j]*(j-i)){
        // area = heights[j]*(j-i);
        // j--;
        // }
        // else if(heights[i]<=heights[j] && area < heights[i]*(j-i)){
        // area = heights[i]*(j-i);
        // i++;
        // }
        }
        return area;
    }
}

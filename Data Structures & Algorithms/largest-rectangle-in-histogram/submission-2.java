class Solution {
    // private int index;
    // private int value;
    // public Solution(int a, int b){
    //     index = a;
    //     value = b;
    // }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> index = new Stack<>();
        Stack<Integer> value = new Stack<>();

       index.push(0);//0,
         value.push(heights[0]);//7
         int max = 0;
         
        for(int i =1;i< heights.length;i++){//1,2,3,4,5
            boolean ifPoped = false;
            int nei =0;
            while(!value.isEmpty() && value.peek() > heights[i]){//t,f,t,f,f
                //if(value.isEmpty()) break;//f,f
              int cumax = value.pop() * (i-index.peek());//7,7
              nei=index.pop();
              //index.pop();
              ifPoped = true;
              if(max< cumax){
                max = cumax;//7
              }
            }
            value.push(heights[i]);//1,2,2,4//1,3,7
             
            // int peek = index.peek();
             int nei2 = ifPoped == true ? nei : i;//
             index.push(nei2);//1,3,4,5//0,1,2
             

        }
        while(!value.isEmpty()){
                System.out.println(index.peek() +" sum "+value.peek());
                int cumax = value.pop() * (heights.length - index.peek());//7,7
                System.out.println(cumax +" com "+ max);
                index.pop();
              //ifPoped = true;
              if(max < cumax){
                max = cumax;//7
              }
             }
        return max;
    }
}

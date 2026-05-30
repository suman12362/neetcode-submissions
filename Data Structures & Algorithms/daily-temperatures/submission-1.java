class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> st = new Stack<>();
          int[] nd = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
          while(!st.isEmpty() &&temperatures[i]> temperatures[st.peek()]){
            nd[st.peek()] = i- st.peek();
            st.pop();
          }
          //else{
            st.push(i);
          //}
        }
        return nd;
    }
}
//     //int max = ;
    //     int[] nd = new int[temperatures.length];
    //     int i =0;
    //     do{
    //         if(st[i] > st[i-1]){
    //             ns[i-1] = i-
    //             st.pop();
    //        st.push(temperatures[i]);}
    //        else if(st[i] < st[i-1]){
    //         st.push(temperatures[i]);
    //        }

    //     }while();
    // }
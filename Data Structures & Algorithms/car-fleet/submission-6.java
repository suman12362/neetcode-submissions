class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        //HashSet<Integer> hs = new HashSet<>();
        Stack<Double> hs = new Stack<>();
        // for(int i = 0;i<position.length;i++){
        //     position[i] = (target - position[i] ) / speed[i];
        //     System.out.println(position[i]);
        //     hs.add(position[i]);
        // }

        for(int i = 0;i<position.length-1;i++){
          for(int j = i+1;j<position.length;j++){
          if(position[i] > position[j]){
           // System.out.println(position[i]);
            int temp = position[i];
            position[i] =position[j];
            position[j] = temp;
            int temp2 = speed[i];
            speed[i] =speed[j];
            speed[j] = temp2;
          }
        }
        }

       System.out.println(Arrays.toString(position));
       System.out.println(Arrays.toString(speed));
       double timeForiminus = (double)(target - position[0]) / speed[0];
         hs.push(timeForiminus);
         for(int i = 1;i<position.length;i++){
            // int j = hs.size()-1;
            // double timeForiminus = (double)(target - position[i-1]) / speed[i-1];//4/3
            // System.out.println(timeForiminus);
            double timeFori = (double)(target - position[i]) / speed[i];//1
            System.out.println(timeFori);
            while(hs.peek() <= timeFori){
                  hs.pop();
                  if(hs.isEmpty()) break;
            }
            //int j = hs.size()-1;
            // if(timeForiminus <= timeFori){
            //     hs.pop();
            //     hs.push(timeFori);
            // }else{
                hs.push(timeFori);
           // }
         }
        return hs.size();
        // for(int i = 0;i<position.length;i++){
        //     if(!hs.add(position[i])){

        //     }
        // }

    }
}

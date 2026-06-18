class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)  -> Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,k});
       // List<Integer> ls = new ArrayList<>();
       int[] res = new int[n+1];
       for(int i=1;i<n+1;i++){
        res[i] = Integer.MAX_VALUE;
       }
       res[k] = 0;
        //boolean visit[] = new boolean[n];
        while(!pq.isEmpty()){
          int[] openpq = pq.poll();
          int wto = openpq[0];
          int src = openpq[1];
          //System.out.println(src);
          for(int[] x : times){
            //System.out.println(Arrays.toString(x));
            int u = x[0];
            int v = x[1];
            int wtn = x[2];
            if(u == src){
             // System.out.println("v-----v");
                //if(!visit[v]){
                   if(res[v] > wtn + wto){
                    pq.add(new int[]{wtn+wto,v});
                    res[v] = wtn + wto;
                      }
                
            }
          }
        }
        System.out.println(Arrays.toString(res));
        int z =0;
        for(int i =1;i<n+1;i++){
          if(res[i] == Integer.MAX_VALUE)
          return -1;
          else{
            z = Math.max(z,res[i]);
          }
        }
      //  int z = res[n] - res[k];
        // if(z<0)
        // return -1;
        return z;
    }
}

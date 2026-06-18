class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        //PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        Queue<int[]> pq = new LinkedList<>();
        int[] res = new int[n];
        Arrays.fill(res,Integer.MAX_VALUE);
        pq.add(new int[]{0,src,-1});
        

        while(!pq.isEmpty()){
           // k--;
            int[] pop = pq.poll();
            int curwt = pop[0];
            int curu = pop[1];
           // int curv = pop[2];
             int stops = pop[2];
            for(int[] flight : flights){
                int u = flight[0];
            int v = flight[1];
            int wt = flight[2];
                if(u == curu){
                    if(res[v] > curwt + wt && stops +1 <=k){
                        res[v] = curwt + wt;
                        pq.add(new int[]{res[v],v,stops+1});
                    }
                }
            }
        }
        if(res[dst] == Integer.MAX_VALUE)
        return -1;
        return res[dst];
    }
}

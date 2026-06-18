class Solution {
    public int minCostConnectPoints(int[][] points) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        HashSet<Integer> hs = new HashSet<>();
        int cost =0;
        pq.add(new int[]{0,0});
       // hs.add(0);
        while(!pq.isEmpty()){
            int[] poped = pq.poll();
            int curwt = poped[0];
            int curpoint = poped[1];
            if(hs.contains(curpoint))
            continue;
            cost += curwt;
            hs.add(curpoint);
            for(int i = 0;i<points.length;i++){
                if(!hs.contains(i)){
                    pq.add(new int[]{mandis(points,curpoint,i),i});
                }
            }
        }
        return cost;
    }
    public int mandis(int[][] points,int p,int q){
        int sum = Math.abs(points[p][0] - points[q][0]) + Math.abs(points[p][1] - points[q][1]);
        return sum;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Double> pq = new PriorityQueue<>();
        HashMap<Double,List<int[]>> hs = new HashMap<>();
   for(int i =0;i<points.length;i++){
    // System.out.println(points[i][0] +"vvv"+ points[i][1]);
    // System.out.println(Math.abs(points[i][0] - 0));
    // System.out.println((Math.abs(points[i][0] - 0))^2 );
    // System.out.println((Math.abs(points[i][1] - 0))^2 );
    double x =(double) Math.sqrt(Math.pow((Math.abs(points[i][0] - 0)),2) + Math.pow((Math.abs(points[i][1] - 0)),2));
    pq.add(x);
    hs.putIfAbsent(x,new ArrayList<>());
    hs.get(x).add(points[i]);
   // hs.put(x,points[i][0]points[i][1]);
    //System.out.println(x);
   }
   int[][] tot = new int[k][2];
   int i =0;
    while(k>0){
     k--;
     double dis = pq.poll();
     List<int[]> pointList = hs.get(dis);
     if (pointList != null && !pointList.isEmpty()) {
                tot[i] = pointList.remove(0); 
                i++;
            }
    }
   return tot;
    }
}

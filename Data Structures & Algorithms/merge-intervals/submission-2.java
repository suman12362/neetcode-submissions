class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        Map<Integer,Integer> lineSweep = new TreeMap<>();
        lineSweep.put(intervals[0][0],intervals[0][1]);
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]<=intervals[i-1][1]){
               lineSweep.put(intervals[i-1][0],Math.max(intervals[i-1][1],intervals[i][1]));
               intervals[i][0] = Math.min(intervals[i-1][0],intervals[i][0]);
               intervals[i][1] = Math.max(intervals[i-1][1],intervals[i][1]);
            }else{
                lineSweep.put(intervals[i][0],intervals[i][1]);
            }

        }
        int[][] res = new int[lineSweep.size()][2];
        int i =0;
        for(int n :lineSweep.keySet()){
               res[i][0] = n;
               res[i][1] = lineSweep.get(n);
               i++;
        }
        System.out.println(lineSweep);
        return res;
    }
}

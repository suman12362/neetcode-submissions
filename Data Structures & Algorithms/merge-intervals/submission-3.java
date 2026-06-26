class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int[] curnode = intervals[0];
        res.add(curnode);
        
        for(int i =1;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start <= curnode[1]){
                curnode[1] = Math.max(curnode[1],end);
            }else{
                curnode = intervals[i];
                res.add(curnode);
                
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}

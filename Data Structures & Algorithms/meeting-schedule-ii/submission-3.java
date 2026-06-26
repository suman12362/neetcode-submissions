/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

     Map<Integer,Integer> lineSweep = new TreeMap<>();
     for(Interval n :  intervals){
        lineSweep.put(n.start,lineSweep.getOrDefault(n.start,0)+1);
        lineSweep.put(n.end,lineSweep.getOrDefault(n.end,0)-1);
     }
     int max =0; int cur = 0;
     for(int n : lineSweep.keySet()){
          cur += lineSweep.get(n);
          max = Math.max(cur,max);
     }
     return max;
    }
}

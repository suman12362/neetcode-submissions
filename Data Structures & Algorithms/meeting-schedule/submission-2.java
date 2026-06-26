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
    public boolean canAttendMeetings(List<Interval> intervals) {
     //int min = 
     intervals.sort((a,b) -> Integer.compare(a.start,b.start));
     for(int i =1;i<intervals.size();i++){
        Interval v = intervals.get(i);
        Interval u = intervals.get(i-1);
       if((v.start>= u.start && v.start < u.end) || (v.end >= u.start && v.end< u.end)){
         return false;
       }
     }
     return true;
    }
}

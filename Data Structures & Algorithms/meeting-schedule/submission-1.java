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
           int n=intervals.size();
           int[][] meet=new int[n][2];
           for(int i=0;i<n;i++)
           {
            meet[i][0]=intervals.get(i).start;
            meet[i][1]=intervals.get(i).end;
           }

           Arrays.sort(meet,(a,b)->a[0]-b[0]);

           if(n==0)
           return true;

           int prevEnd=meet[0][1];
           for(int i=1;i<n;i++)
           {
            if(meet[i][0]<prevEnd)
            return false;
            prevEnd=meet[i][1];
           }
           return true;
    }
}

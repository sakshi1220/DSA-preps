import java.util.Arrays;
//----------APPROACH-1------------------------->
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0,j=1;
        while(j<intervals.length){
            int [] curr_interval= intervals[i]; 
            int [] next_interval= intervals[j];
            // int cs=curr_interval[0];
            int ce=curr_interval[1];

            int ns=next_interval[0];
            int ne=next_interval[1];
            if(ce<=ns){
                i=j;
                j++;
            }
            else if(ce<=ne){
                j++;
                count++;
            }
            else if(ce>ne){
                i=j;
                j++;
                count++;
            }
        }
        return count;
    }

//---------------------------APPROACH 2---------------------------->

        public int eraseOverlapIntervals2(int[][] intervals) {
                
            Arrays.sort(intervals,(a,b)->a[1]-b[1]);
            int i=1,count=1,prev=0;
            while(i<intervals.length){
                if(intervals[i][0]>=intervals[prev][1]){
                    prev=i;
                    count++;
                
                }
                i++;
            }
            return intervals.length-count;
        }




    public static void main(String[] args) {
        int [][] intervals = new int[][] {{1,2},{2,3},{3,4},{1,3}};
        Solution s = new Solution();
        System.out.println(s.eraseOverlapIntervals(intervals));
        System.out.println(s.eraseOverlapIntervals2(intervals));
    }
}


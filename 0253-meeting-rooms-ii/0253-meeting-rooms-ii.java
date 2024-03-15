class Solution {
    public int minMeetingRooms(int[][] intervals) {

        //Check for the base case. If there are no Intervals return 0
        if(intervals.length == 0)
           {
            return 0;
           }

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for(int i=0; i<intervals.length; i++)
        {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];

        }   
     
     Arrays.sort(start);
     Arrays.sort(end);
   
      int usdRooms =0;

      for(int idStart=0, idEnd=0; idStart < intervals.length; idStart++)
      {
        if(start[idStart] < end[idEnd])
        {
            usdRooms++;
        }
        else
        {
            idEnd++;        
        }
        
     }
     return usdRooms;   
        }


        
    }

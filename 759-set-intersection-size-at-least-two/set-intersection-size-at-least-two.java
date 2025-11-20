class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        
         // Sort by end increasing
        Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int count = 0;
        int a = -1, b = -1; // last two selected points

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            // Case 1: both points are outside the interval
            if (start > b) {
                // Add last two points of this interval
                a = end - 1;
                b = end;
                count += 2;
            }
            // Case 2: only one point is inside the interval
            else if (start > a) {
                // Add the largest point end
                a = b;
                b = end;
                count += 1;
            }
            // Case 3: already have two points inside → do nothing
        }

        return count;
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        // here we are used a kadane's algorithm to solve it
        // this variable are define for the max 
        int currentmax=0, maxsum=arr[0];

        // this variable is define for minmun
        int currentmin=0, minsum=arr[0];

        // this is used to find the total sum
            int totalsum=0;
        // apply a loop 
        for(int i=0;i<arr.length;i++){
            currentmax=Math.max(currentmax+arr[i],arr[i]);
            maxsum=Math.max(maxsum,currentmax);

            currentmin=Math.min(currentmin+arr[i],arr[i]);
            minsum=Math.min(minsum,currentmin);

            totalsum=totalsum+arr[i];
        }

        if(maxsum<0){
            return maxsum;
        }
        int circularsum=totalsum-(minsum);
        return Math.max(circularsum,maxsum);
    }
}
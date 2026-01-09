class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int count=0;
        int abs = Integer.MAX_VALUE;
        for(int a[]:matrix){
            for(int n: a){
                if(n<0){
                    count++;
                    n=-n;
                }
                if(n<abs){
                    abs=n;
                }
                sum=sum+n;
            }
        }
        return count%2==1? (long)sum-2*(abs) : (long)sum;
    }
}
class Solution {
    public int maxProduct(int[] arr) {
        // here just find the maxsum of subarray
        
        // int prod=arr[0];
        // int maxsum=Integer.MIN_VALUE;
        // if(arr.length==1) return arr[0];
        // for(int i=1;i<arr.length;i++){
        //     prod=Math.max(prod * arr[i],arr[i]);
        //      maxsum=Math.max(maxsum,prod);
           
        // }
        // return maxsum;
        int prefix=1;
        int suffix=1;
        int n=arr.length;
        int prod=arr[0];
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
        prod=Math.max(prod,Math.max(prefix,suffix));
        }
        return prod;
    }

}
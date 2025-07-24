class Solution {
    public int maxSubArray(int[] nums) {
    //    int max=nums[0];
    //     int sum=0;
    //     if(nums.length==1){
    //         return max;
    //     }
    //     else{
    //      for(int i=0;i<nums.length;i++){
	// 	   sum=sum+nums[i];
	// 	   if(sum<nums[i]){
	// 		   sum=nums[i];
	// 	   }
	// 	   if(sum>max){
	// 		   max=sum;
	// 	   }
	//    }
    //     }
    //     return max;

    //using the kadane's algorithm 
   
    if(nums.length==0){
        return 0;
    }
        int max_current=nums[0];
         int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            max_current=Math.max(nums[i],max_current+nums[i]);
            if(max_current>max_sum){
                max_sum=max_current;
            }
        }
    
    return max_sum;
    }
}
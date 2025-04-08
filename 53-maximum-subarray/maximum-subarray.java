class Solution {
    public int maxSubArray(int[] nums) {
       int max=nums[0];
        int sum=0;
        if(nums.length==1){
            return max;
        }
        else{
         for(int i=0;i<nums.length;i++){
		   sum=sum+nums[i];
		   if(sum<nums[i]){
			   sum=nums[i];
		   }
		   if(sum>max){
			   max=sum;
		   }
	   }
        }
        return max;
    }
}
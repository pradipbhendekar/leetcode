class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int j=0,i=0;
       int sum=0;
       int size = Integer.MAX_VALUE;
       while(j<nums.length){
               sum=sum+nums[j];
               j++;
       
       while(sum>=target){
         size=Math.min(size,j-i);
         sum=sum-nums[i];
         i++;
       }
       }
      return ( size==Integer.MAX_VALUE?0:size);
        
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int sum=0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            
            sum=(sum+nums[i])*nums[i];
            result=Math.max(result,sum);
            
        }
        return result;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int start=0;
        int end=start+1;
        while(start<nums.length){
            if((nums[start]+nums[end])==target){
                result[0]=start;
                result[1]=end;
                return result;
            }else if(end<nums.length){
                end++;
            }if(end>=nums.length && start<nums.length){
                start++;
                end=start+1;
            }
        }
       
        
        return result;
        
    }
    
}
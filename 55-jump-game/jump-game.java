class Solution {
    public boolean canJump(int[] nums) {
        int jump=0;
        int ljump=0;
        if(nums.length==1) return true;
        for(int i=0;i<nums.length;i++){
            if(ljump<i) return false;
            ljump=Math.max(ljump,nums[i]+i);
            if(ljump>= nums.length) return true;

        }   
        return true;
    }
}
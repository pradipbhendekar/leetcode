class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        //here we can search the target elemet into the array
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
            }
        }
        return index;
    }
}
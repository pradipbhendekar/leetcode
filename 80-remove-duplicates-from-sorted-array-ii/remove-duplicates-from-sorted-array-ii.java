class Solution {
    public int removeDuplicates(int[] nums) {
    //    int i=0;
    //    int j=0;
    //    while(i<nums.length && j<nums.length){
    //        if(nums[i]==nums[j]){
    //            j++;
    //        }else{
    //            i=j;
    //        }
    //    }
    //     return i;

    // this is the actual ans of this question usng the two pointer
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
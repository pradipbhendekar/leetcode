class Solution {
    public int removeDuplicates(int[] nums) {
  
    // using two pointer we are solve this question
        int k=2;    //intially we can gives the k size 2
        for(int i=2;i<nums.length;i++){  // apply the for loop
            if(nums[i]!=nums[k-2]){    //check if the nums[0]!-nums[2]=true then swap the elment with the k positon
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        //here we can delete the elements using the using the vector
       
       int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
      return count;
       
    }
}
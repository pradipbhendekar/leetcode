class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean flag=true;
      if(nums.length==1){
            return flag;
      } else{
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2==0 && nums[i+1]%2!=0 || nums[i]%2!=0 && nums[i+1]%2==0){
                    flag=true;
            }else{
        return false;
            }
        }
      }
      
      return flag;
    }
}
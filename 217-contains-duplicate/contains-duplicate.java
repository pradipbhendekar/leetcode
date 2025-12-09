class Solution {
    public boolean containsDuplicate(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       boolean flag=true;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
                return false;//is not 
    }
}
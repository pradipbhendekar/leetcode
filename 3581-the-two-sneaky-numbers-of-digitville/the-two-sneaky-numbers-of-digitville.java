class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        // here we are create another array and store the duplicate element in this array
        int[] result=new int[2];
        int index=0;
        // here we are store the element in the other array
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>=2){
                map.put(nums[i],0);
                result[index++]=nums[i];
                
            }
        }
        return result;
    }
}
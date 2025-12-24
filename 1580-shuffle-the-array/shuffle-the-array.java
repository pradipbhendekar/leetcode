class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[nums.length];
        int count=0;
        int temp=1;
        for(int i=0;i<nums.length;i++){
           if(i%2==0){
            result[i]=nums[count];
            count++;
           }else{
            result[i]=nums[n++];
            // temp++;
           }
        }
        return result;
        
    }
}
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] result=new int[2];
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==target){
                 result[0]=left+1;
                 result[1]=right+1;
                 return result;
                
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
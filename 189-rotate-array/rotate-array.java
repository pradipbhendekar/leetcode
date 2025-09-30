class Solution {
    public void rotate(int[] nums, int k) {
       

    
    //     for(int i=0;i<k;i++){
    //       int temp=nums[nums.length-1];
    //       for(int j=nums.length-1;j>0;j--){
    //           nums[j]=nums[j-1];
    //       }
    //       nums[0]=temp;
    //   }
      
        k = k % nums.length; 
      //reverse the hole array
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        //now rotate the first kth number
          start=0;
         end=k-1;
        while(start<end){
             int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
         start=k;
         end=nums.length-1;
          while(start<end){
             int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        
        

    }
}
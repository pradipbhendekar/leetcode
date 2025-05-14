class Solution {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){

            // if the 9 is not 
            if(digits[i]<9){
              digits[i]+=1;
              break;  
            }
            // if digits are not 9 then simply addition
            if(digits[i]==9){
            digits[i]=0;
            }
        //if oth number of dgits 9 them create the array

        if(digits[0]==0){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            digits=arr;
        }
        
        
         
        }  
        
      return digits;     
    }
}
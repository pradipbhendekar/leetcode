class Solution {
    public boolean isPowerOfFour(int n) {

         //this is the base case
        if(n<=0) return false;
        if(n==1) return true;

        //here check the n is divisible by 2 or not
        if(n%4 !=0) return false;

        //here we call the function itself
        return isPowerOfFour(n/4);
        
    }
}
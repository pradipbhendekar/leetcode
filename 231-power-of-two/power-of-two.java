class Solution {
    public boolean isPowerOfTwo(int n) {
        //this is the base case
        if(n<=0) return false;
        if(n==1) return true;

        //here check the n is divisible by 2 or not
        if(n%2 !=0) return false;

        //here we call the function itself
        return isPowerOfTwo(n/2);
    }
}
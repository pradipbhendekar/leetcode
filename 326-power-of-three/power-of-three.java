class Solution {
    public boolean isPowerOfThree(int n) {

    // here write the base case 
     if(n<=0) return false;
     if(n==1) return true;
    
    //here check the condition if n is not dividsible by s 
    if(n%3 !=0) return false;

    // here write the condition
     return isPowerOfThree(n/3);

    
    }
}
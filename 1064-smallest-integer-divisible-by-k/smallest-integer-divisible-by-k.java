class Solution {
    public int smallestRepunitDivByK(int k) {
        //here we can travels the array and check each and every nodes
        int number=0;
        int count=0;
        for(int i=1;i<=k;i++){
            number=(number*10+1)%k;
            if(number==0) return i;
            
            
        }
        
        return -1;
    }
}
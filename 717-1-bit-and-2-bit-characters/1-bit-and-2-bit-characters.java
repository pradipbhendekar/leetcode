class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        // if(bits.length==2 && bits[0]==0) return true;
        // if(bits.length%2==1 && bits[bits.length-1]==0) return true;
        //  return false;
        int n=0;
        if(bits.length==1 && bits[0]==0) return true;
         while(n<bits.length-1){
            if(bits[n]==1) n=n+2;
            else n=n+1;   
            if(n==bits.length-1 && bits[bits.length-1]==0) return true; 
        }
        return false;
    }
}
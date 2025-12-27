class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         int left=0;
       int maxlength=0;
       int[] fre=new int[256];// this is create to 
       for(int right=0;right<s.length();right++){
           char ch=s.charAt(right);
           fre[ch]++;   // here we are update the values appearance
           while(fre[ch]>1){
               fre[s.charAt(left)]--; 
               left++;
           }
           maxlength=Math.max(maxlength,right-left+1); //here i am update the length value
       }
       
       //System.out.println(maxlength);
       return maxlength;
        
    }
}
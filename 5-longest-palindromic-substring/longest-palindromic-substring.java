class Solution {
    public String longestPalindrome(String s) {
       
       
        String result="";
        String palindram="";
        int start=0;
        int end=start+1;
        while(start<s.length()){
            if(end<=s.length()){
          result=s.substring(start,end);  
          
          int i=0;
          int j=result.length()-1;
          boolean flag=true;
          while(i<j){
              if(result.charAt(i)!=result.charAt(j)){
                  flag=false;
                   break;
              }else{
                  i++;
                  j--;
              }
          }
          if(flag  && result.length() > palindram.length()) palindram=result;
            end++;
            }else{
                start++;
                end=start;
            }
          
        }
        return palindram;

   
       
    }
}
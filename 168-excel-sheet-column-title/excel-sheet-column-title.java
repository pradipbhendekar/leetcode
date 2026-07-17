class Solution {
    public String convertToTitle(int n) {
        String result="";
       while(n > 0){
           n--;
           int rem=n%26;
           char ch=(char)('A' + rem);
           result=ch+result;
           n=n/26;
       }
  return result;
    }
}
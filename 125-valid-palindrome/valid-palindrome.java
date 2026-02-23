class Solution {
    public boolean isPalindrome(String str) {
       
       String s=str.toLowerCase();
       // here check the string is empty or not
       if(s==" ") return true;

       // now check the given string is palindram or not
       int left=0;
       int right=s.length()-1;
        int count=1;
       while(left<=right){
        char leftchar=s.charAt(left);
        char rightchar=s.charAt(right);
        if(Character.isLetterOrDigit(leftchar) && Character.isLetterOrDigit(rightchar)){
            count++;
            if(leftchar==rightchar){
                left++;
                right--;
             }else{ 
                return false;
             }
        }if(! Character.isLetterOrDigit(leftchar)){
            left++;
        }
        if(! Character.isLetterOrDigit(rightchar)){
            right--;
        }
       }
      return true;
    }
}
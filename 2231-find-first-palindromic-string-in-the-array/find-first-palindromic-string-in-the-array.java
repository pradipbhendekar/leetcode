class Solution {
    public String firstPalindrome(String[] str) {
        
        /*here we can write the logic of the Strig array traverse and the comapte the string
        if the first String is the palindram then we return the true otherwise we can write the false
        */
        boolean flag=true;
        for(int i=0;i<str.length;i++){
            String s=str[i];
            int start=0;
            int end=s.length()-1;
            while(start<end){
                if(s.charAt(start)!=s.charAt(end)){
                    flag=false;
                    break;
                }
                start++;
                end--;
            }
            if(flag==true){
                return str[i];
            }
            flag=true;
        }
        return "";
    }
}
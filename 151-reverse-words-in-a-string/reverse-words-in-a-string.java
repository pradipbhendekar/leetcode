class Solution {
    public String reverseWords(String s) {
        s.trim();
        String result="";
        String[] str=s.split(" +");
        for(int i=str.length-1;i>=0;i--){
            result=result+str[i]+" ";
           
        }
            return result.trim();
    }
}
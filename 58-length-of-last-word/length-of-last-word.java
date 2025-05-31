class Solution {
    public int lengthOfLastWord(String s) {
        int size=0;
        if(s.length()==0){
            return 0;
        }else{
            String[] str=s.split(" ");
            size=str[str.length-1].length();
        }  
        return size;
    }
}
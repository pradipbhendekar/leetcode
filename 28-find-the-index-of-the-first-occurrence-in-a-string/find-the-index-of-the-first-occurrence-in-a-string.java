class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==" "){
            return -1;
        }else{
           int index=haystack.indexOf(needle);
           if(index!=-1)
            return index;
        }
        return -1;
    }
}
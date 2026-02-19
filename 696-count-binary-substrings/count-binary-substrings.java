class Solution {
    public int countBinarySubstrings(String s) {
        
        int currentgroup=1;
        int previousgroup=0;
        int count=0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentgroup++;
            }else{
                count=count+Math.min(previousgroup,currentgroup);
                previousgroup=currentgroup;
                currentgroup=1;
            }
        }
        count=count+Math.min(previousgroup,currentgroup);
            return count;
    }
}
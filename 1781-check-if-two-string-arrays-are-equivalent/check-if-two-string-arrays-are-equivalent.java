class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        
        // herer we are check the both string is empty of not
        if(w1.length==0 && w2.length==0) return true;
        if(w1.length>=0 && w2.length==0 || w1.length==0 && w2.length>=0) return false;

        // here we are check the string is equivalement of not
        String str1="";
        String str2="";
        for(String s:w1){
            str1=str1+s;
        }
        for(String s:w2){
            str2=str2+s;
        }

        return str1.equals(str2);
    }
}
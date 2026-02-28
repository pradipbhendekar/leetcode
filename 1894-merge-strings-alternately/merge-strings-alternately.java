class Solution {
    public String mergeAlternately(String w1, String w2) {
        
        if(w1.length()==0 && w2.length()==0) return "";
        if(w1.length()==0 && w2.length()>=1) return w2;
        if(w1.length()>=1 && w2.length()==0) return w1;

        // here we are merge the two string into one string
        int start=0;
        int second=0;
        String result="";
       while(w1.length()>start || w2.length()>second){
        if(w1.length()>start){
            result=result+w1.charAt(start);
            start++;
        }
        if(w2.length()>second){
            result=result+w2.charAt(second);
            second++;
        }

       }
       return result;
    }
}
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(s);
       int start=0;
       int end=s.length()-1;
        while(start<end){
           char s_char=sb.charAt(start);
           char e_char=sb.charAt(end);
           if(Character.isLetter(s_char) &&Character.isLetter(e_char)){
                 char temp=s_char;
                 // s_char=e_char;
                 sb.setCharAt(start,e_char);
                 // e_char=temp;
                 sb.setCharAt(end,temp);
                    start++;
                    end--;
           }else if(!Character.isLetter(s_char)) start++;
                if(!Character.isLetter(e_char)) end--;
        }
            return sb.toString();
    }
}
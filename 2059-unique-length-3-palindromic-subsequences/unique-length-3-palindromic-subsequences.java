class Solution {
    public int countPalindromicSubsequence(String s) {

         int count=0;
        for(char ch='a';ch<='z';ch++){
            int first=s.indexOf(ch);
            int last=s.lastIndexOf(ch);
            //here i am chech the character is available or not
            if(first==-1 || last==-1 || first==last) continue;
            // here i am create the boolean array to update if the charecter is present or not 
            boolean[] middlechar=new boolean[26];
            //here create one array to to count the palindram subString
            for(int i=first+1;i<last;i++){
                middlechar[s.charAt(i)-'a']=true; // here i am update the value ascii value of 'a' is 97
            }
            //here to count the updtated value(true) in a arrat and count
            for(boolean c:middlechar){
                if(c) count++;
            }
            
        }
        return count;
        
    }
}
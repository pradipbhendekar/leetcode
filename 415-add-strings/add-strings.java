class Solution {
    public String addStrings(String num1, String num2) {
        int first=num1.length()-1;
        int second=num2.length()-1;
        int carry=0;
        String result="";
        while(first>=0 || second>=0 || carry>0){ 
           int a=(first>=0) ? num1.charAt(first)-'0' : 0;
            int b=(second>=0) ? num2.charAt(second)-'0' : 0;

            int add=a+b+carry;  //here we are add the two numbers
            int n=add%10;
            carry=add/10;
            first--;
            second--;
            result=n+result;

        }
        return result;
       
}
}
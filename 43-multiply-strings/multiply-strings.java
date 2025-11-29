import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
       
        String str=null;
        if(num1=="" && num2==""){
            return "0";
        }else{
            // int number1=Integer.parseInt(num1);
            // int number2=Integer.parseInt(num2);
             BigInteger number1 = new BigInteger(num1);
            BigInteger number2 = new BigInteger(num2);
            BigInteger result=number1.multiply(number2);
            // result=number1*number2;
             return result.toString();
            

        }
       
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        //Arrays.sort(bills);
       int five=0,ten=0;
       for(int arr:bills){
            if(arr == 5){
                five++;
            }
           else if(arr == 10){
                ten++;
                five--;
            }
           else if(arr == 20){
                if(ten > 0 && five > 0){
                  ten--;
                  five--;
                }else{
                    five -= 3;
                }
            }

              if (five < 0 || ten < 0) {
                return false;
            }
       }
       return true;
    }
}
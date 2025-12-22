class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set=new HashSet<>();
        
        while(n != 1){
           if(set.contains(n)){ 
              return false; //if the number is contains then gives return false;
           }
           set.add(n);      // else add

           int sum=0;  //to calculate the each number suare
           while(n>0){
            int rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
           }
            n=sum;
        }

        return true;
    }
}
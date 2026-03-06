class Solution {
    public int jump(int[] arr) {
    
        int ljump=0;
        int jump=0;
        int currentjump=0;
        
        for(int i=0;i<arr.length-1;i++){
            ljump=Math.max(ljump,arr[i]+i);

            if(i == currentjump){
                 jump++;
                currentjump=ljump;
               
            }
        }
       
      return jump;


    }
}
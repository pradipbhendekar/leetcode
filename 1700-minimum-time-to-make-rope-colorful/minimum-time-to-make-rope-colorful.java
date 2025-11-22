class Solution {
    public int minCost(String colors, int[] neededTime) {
      char ch=colors.charAt(0);
        int maxTime=neededTime[0];
        int result=0;
        int count=0;
        for(int i=1;i<neededTime.length;i++){
            if(ch==colors.charAt(i)){
                 result=result+Math.min(maxTime,neededTime[i]);
                 maxTime=Math.max(maxTime,neededTime[i]);
            }else{
                ch=colors.charAt(i);
                maxTime=neededTime[i];
            }
        }
     return  result;  
    }
}
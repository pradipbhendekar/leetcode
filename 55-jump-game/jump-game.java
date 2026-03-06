class Solution {
    public boolean canJump(int[] arr) {
      int ljump=0;
      for(int i=0;i<arr.length;i++){
        if(ljump < i) return false;
        ljump=Math.max(ljump,arr[i]+i);

      } 
      return true;
    }
}
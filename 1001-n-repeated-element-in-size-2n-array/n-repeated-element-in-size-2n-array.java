class Solution {
    public int repeatedNTimes(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int n:nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }else{
                return n;
            }
       }
       return -1;
    }
}
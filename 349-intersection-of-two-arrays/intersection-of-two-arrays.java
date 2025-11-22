class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         //here we are create the hashset to remove the duplicates
         HashSet<Integer> set1=new HashSet<>();
         for(int num:nums1){
                set1.add(num);
         }
         // create the anoter hashset to remove the duplicates
         HashSet<Integer> resultset=new HashSet<>();
         for(int num:nums2){
                if(set1.contains(num)) resultset.add(num);
         }
         
         // create array to store the values
         int[] result=new int[resultset.size()];
         int start=0;
         for(int n:resultset) result[start++]=n;
         
         return result;
         
    }
}
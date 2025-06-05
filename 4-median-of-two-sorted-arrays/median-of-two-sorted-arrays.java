class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,merge,0,nums1.length);
        System.arraycopy(nums2,0,merge,nums1.length,nums2.length);
        Arrays.sort(merge);
        if(merge.length==0){
            return 0;
        }
        if(merge.length%2==1){
            return merge[merge.length/2];
        }else{
            return  ((merge[merge.length/2])+(merge[(merge.length/2)-1]))/2.0;
        }
    }
}
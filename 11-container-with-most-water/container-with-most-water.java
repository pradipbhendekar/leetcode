class Solution {
    public int maxArea(int[] height) {

        /* this problem is solve using concept of two pointer and use
         { Area = (j − i) × min(height[i], height[j])}
         this formula
        */
       int start=0;
       int end=height.length-1;
       int result=0;
       while(start<end){
        int area= (end-start) * Math.min(height[start],height[end]);
        if(area>result){
            result=area;
        }
        if(height[start]>height[end]){
            end--;
        }else{
            start++;
        }

       }
       
        return  result;
    }
}

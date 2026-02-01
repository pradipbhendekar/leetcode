class Solution {
    public int[] findIntersectionValues(int[] arr1, int[] arr2) {
     
     List<Integer> list1=new ArrayList<>();
       List<Integer> list2=new ArrayList<>();
       int count1=0;
        int count2=0;
        for(int i=0;i<arr1.length;i++){
            list1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
             list2.add(arr2[i]);
        }
        //check
        for(int i=0;i<arr1.length;i++){
            if(list2.contains(arr1[i])) count1++;
        }
        for(int i=0;i<arr2.length;i++){
            if(list1.contains(arr2[i])) count2++;
        }
        int[] result={count1,count2};
       return  result;
    }
}
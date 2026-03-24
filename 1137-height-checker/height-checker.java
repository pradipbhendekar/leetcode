class Solution {
    public int heightChecker(int[] arr) {
    int[] result=new int[arr.length];
    int count=0;

    for(int i=0;i<arr.length;i++){
        result[i]=arr[i];
    }
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i] != result[i]){
            count++;
        }

    }
     return count;   
    }
}
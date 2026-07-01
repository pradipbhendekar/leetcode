class Solution {
    public int thirdMax(int[] arr) {
        Arrays.sort(arr);
        int first = arr[arr.length-1];
        int count = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (first > arr[i]) {
                first = arr[i];
                count++;
            } 
            if (count == 3) {
                return first;
            }
        }
        return arr[arr.length-1];
       
    }
}
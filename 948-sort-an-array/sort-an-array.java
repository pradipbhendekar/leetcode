class Solution {

    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        sort(nums, start, end);
        return nums;
    }

    public void sort(int[] nums, int start, int end) {
        // this is the base case
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        //divide the array
        sort(nums, start, mid);
        sort(nums, mid + 1, end);

        //merge the array
        merge(nums, start, mid, end);

    }

    public void merge(int[] nums, int start, int mid, int end) {
        //here we are writ the merge logic
        int[] result = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                result[k++] = nums[i++];
            } else {
                result[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            result[k++] = nums[i++];
        }
        while (j <= end) {
            result[k++] = nums[j++];
        }

        for (int p = 0; p < result.length; p++) {
            nums[start + p] = result[p];
        }
    }

}
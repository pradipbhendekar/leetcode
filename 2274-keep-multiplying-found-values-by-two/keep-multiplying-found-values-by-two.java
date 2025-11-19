class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        //time complexity is O(nlogn)

        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(original==nums[i]){
        //         original=original*2;
        //     }
        // }
        // return original;

        //reduce the complexity
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int start=0;
        while(start<set.size()){
            if(set.contains(original)) 
                original=original*2;
                start++;
        }
        
        return original;
}}
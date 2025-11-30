class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        /*
        String prefix="";
        long decimal=0;
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            System.out.println(prefix);
            decimal = Integer.parseInt(prefix, 2);

            if(decimal%5==0){
                list.add(true);
            }else{
                list.add(false);
            }
            
        }
        return list;
        */
       
  
        List<Boolean> ans = new ArrayList<>();
        int mod = 0;

        for (int bit : nums) {
            mod = (mod * 2 + bit) % 5;
            ans.add(mod == 0);
        }

        return ans;
    


    }
}
class Solution {
   public static void findSet(int[] arr,int i,List<Integer> list, List<List<Integer>> result){
    if(i == arr.length){
        result.add(new ArrayList<>(list));
        //result.add(list);
        return;
    }
    
    // here add the element 
    list.add(arr[i]);
    findSet(arr,i+1,list,result);

    //here remove the element 
    // this remove in backtraking
    list.remove(list.size()-1);
    findSet(arr,i+1,list,result);
    
   }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
       findSet(nums,0,new ArrayList<>(),list);
        return list;
    }
}
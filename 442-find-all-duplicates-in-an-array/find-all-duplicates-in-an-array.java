class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                set.add(arr[i]);
            }
        }
         List<Integer> list=new ArrayList<>(set);
        return list;
    }
}
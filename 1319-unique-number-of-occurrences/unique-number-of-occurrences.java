class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        //here we are check the element occurrence is dupplicate or not
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           int value=entry.getValue();
           if(list.contains(value)){
                return false;
           }else{
            list.add(value);
           }
        }

       
        return true;
    }
}
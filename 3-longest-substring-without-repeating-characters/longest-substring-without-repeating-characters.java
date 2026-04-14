class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    if(s.length()== 1) return 1;
    // this question is solve using a hashtable
    Map<Character,Integer> map=new HashMap<>();

    // here we are used the sliding window approch to find the lingest non-reapeating string
    int left=0;
    int right=0;
    int length=0;
    while(right<s.length()){
       if(! map.containsKey(s.charAt(right))){
        map.put(s.charAt(right),1);
        right++;
       }else{
        length=Math.max(length,map.size());
        map.clear();
        left++;
        right=left;
       }
       
    length=Math.max(length,map.size());
    }
       return length;
    }
}
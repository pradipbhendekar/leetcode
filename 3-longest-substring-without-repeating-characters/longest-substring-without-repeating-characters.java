class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        //now i am solve this using a sliding window and the hashtable
        Map<Character,Integer> map=new HashMap<>();
        int right=0;
        int left=0;
        int length=0;
        while(left<s.length()){
            char ch=s.charAt(left);
            if(!map.containsKey(ch)){
                map.put(ch,1);
                left++;
            }else{
                map.remove(s.charAt(right));
                right++;
            }
            length=Math.max(length,left-right);
        }

        return length;
    }
}
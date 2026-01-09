class Solution {
    public boolean isAnagram(String s, String t) {
    // Map<Character,Integer> map=new HashMap<>();
   
    //     if(s.length()!=t.length()) return false;
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //        if(!map.containsKey(ch)){
    //             map.put(ch,1);
    //        }else{
    //         map.put(ch,map.get(ch)+1);
    //        } 
    //     }

    //     for(int i=0;i<t.length();i++){
    //         char ch=t.charAt(i);
    //        if(map.containsKey(ch))  map.put(ch,map.get(ch)-1);
    //     }
        
    //   for(Map.Entry<Character,Integer> entry: map.entrySet()){
    //     if(entry.getValue()>0 || entry.getValue()<0) return false;
    //   }
    //    return true;


    if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) return false;
        }

        return true;
    }
}
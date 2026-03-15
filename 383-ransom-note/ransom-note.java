class Solution {
    public boolean canConstruct(String rans, String mag) {
        
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<rans.length();i++){
            char ch=rans.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }

        for(int i=0;i<mag.length();i++){
            char ch=mag.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }

        // here we are check in the ransomNote all the character is present in the magazine or not
        for(int i=0;i<rans.length();i++){
            char ch=rans.charAt(i);
            if(!map2.containsKey(ch)||map1.get(ch) > map2.get(ch)){
                return false;
            }
        }

     return true;   
    }
}
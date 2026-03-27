class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> list=new ArrayList<>();
        String[] temp=new String[words.length];
        // here i am sort the all words
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);  
            temp[i]=s;
        }

        
        for(int i=0;i<temp.length-1;i++){
                if(temp[i].equals(temp[i+1])){
                    words[i+1]=null;  
            }
        }
        for(int i=0;i<words.length;i++){
            if(words[i]!= null){
                list.add(words[i]);
            }
        }
        return list;
    }
}
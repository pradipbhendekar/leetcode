class Solution {
    public int possibleStringCount(String word) {

    int count=1;
     if(word==null){
         return 0;
    }else{
    //     Set<Character> set=new HashSet<>();
    //     for(int i=0;i<word.length();i++){
    //         char ch=word.charAt(i);
    //         if(set.contains(ch)){
    //             count++;
    //         }else{
    //             set.add(ch);
    //         }
    //     }
    // }   

   
         Stack<Character> stack=new Stack<>();
    for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if((!stack.isEmpty()) && stack.pop()==ch){
            System.out.println(stack);
            count++;
            stack.push(ch);
        }else{
            stack.push(ch);
        }
    }
    }

    return count;
    }
}
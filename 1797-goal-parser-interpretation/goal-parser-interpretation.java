class Solution {
    public String interpret(String s) {
    String result="";
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' && s.charAt(i+1)==')') result=result+'o';
        if(s.charAt(i)=='G') result=result+'G';
        if(s.charAt(i)=='a' && s.charAt(i+1)=='l') result=result+"al";     
    }

    // for(int i=0;i<stack.size();i++){
    //     char ch=stack.pop();
    //     if(ch=='(' && stack.pop()==')'){
    //         result=result+'o';
    //     }
    //     if(ch=='(' && stack.pop != ')' stack.pop() !='G'){
            
    //     }
    return result;
     }
    
}
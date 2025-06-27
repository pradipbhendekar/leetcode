class Solution {
    public boolean isValid(String s) {
     if (s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;  // if the stack is empty then directly we return 

                char top = stack.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '[' && ch == ']') ||
                    (top == '{' && ch == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    
}   

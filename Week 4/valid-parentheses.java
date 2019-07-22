class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char last='x';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'&&last=='(')
                stack.pop();
            else if(s.charAt(i)==']'&&last=='[')
                stack.pop();
            else if(s.charAt(i)=='}'&&last=='{')
                stack.pop();
            else
                return false;
            if(!stack.empty())
                last=stack.peek();
        }
        if(stack.empty())
            return true;
        return false;
    }
}

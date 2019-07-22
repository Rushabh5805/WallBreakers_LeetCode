class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(')
                st.push(-1);
            else if(S.charAt(i)==')'){
                if(st.peek()==-1){
                    st.pop();
                    st.push(1);
                }
                else if(st.peek()!=-1){
                    int val = 0;
                    while(st.peek()!=-1){
                        val=val+st.pop();
                    }
                    st.pop();
                    st.push(val*2);
                }
            }
        }
        int ans=0;
        while(st.peek()!=-1){
            ans=ans+st.pop();
        }
        return ans;
    }
}

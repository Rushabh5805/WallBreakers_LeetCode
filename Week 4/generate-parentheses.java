class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, n, ans, "");
        return ans;
    }
    public void generate(int left, int right, List<String> ans, String a){
        if(left==0&&right==0){
            ans.add(a);
        }
        if(left>0){
            generate(left-1, right, ans, a+'(');
        }
        if(left<right){
            generate(left, right-1, ans, a+')');
        }
    }
}

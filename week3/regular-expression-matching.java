class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] ans  = new boolean[s.length()+1][p.length()+1];
        ans[0][0]=true;
        for(int i=1;i<ans[0].length;i++){
            if(p.charAt(i-1)=='*')
                ans[0][i]=ans[0][i-2];
        }
        for(int i=1;i<ans.length;i++){
            for(int j=1;j<ans[0].length;j++){
                if(s.charAt(i-1)==p.charAt(j-1)){
                    ans[i][j]=ans[i-1][j-1];
                }
                else if(p.charAt(j-1)=='.'){
                    ans[i][j]=ans[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    if(ans[i][j-2])
                        ans[i][j]=true;
                    else if(s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.')
                        ans[i][j]=ans[i-1][j];
                    else 
                        ans[i][j]=false;
                }
                else 
                    ans[i][j]=false;
            }
        }
        return ans[ans.length-1][ans[0].length-1];
    }
}

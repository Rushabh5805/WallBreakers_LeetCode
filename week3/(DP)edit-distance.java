class Solution {
    public int minDistance(String word1, String word2) {
        int[][] ans = new int [word2.length()+1][word1.length()+1];
        for(int i=0;i<ans.length;i++){
            ans[i][0]=i;
        }
        for(int j=0;j<ans[0].length;j++){
            ans[0][j]=j;
        }
        for(int i=1;i<ans.length;i++){
            for(int j=1;j<ans[0].length;j++){
                if(word2.charAt(i-1)==word1.charAt(j-1))
                    ans[i][j]=ans[i-1][j-1];
                else
                    ans[i][j]=Math.min(ans[i-1][j], Math.min(ans[i-1][j-1], ans[i][j-1]))+1;
            }
        }
        return ans[ans.length-1][ans[0].length-1];
    }
}

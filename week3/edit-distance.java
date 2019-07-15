class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
                
        return findMin(word1, word2, m, n, dp);
    }
    
    public int findMin(String word1, String word2, int m, int n, int[][] dp){
        if(m==0)
            return n;
        
        if(n==0)
            return m;
        
        if(dp[m-1][n-1]!=-1)
            return dp[m-1][n-1];
        
        if(word1.charAt(m-1)==word2.charAt(n-1))
            return dp[m-1][n-1] = findMin(word1, word2, m-1, n-1, dp);
        
        return dp[m-1][n-1]=1+Math.min(findMin(word1, word2, m-1, n, dp), 
                         Math.min(findMin(word1, word2, m, n-1, dp),
                                 findMin(word1, word2, m-1, n-1, dp))
                         );
    }
    
}


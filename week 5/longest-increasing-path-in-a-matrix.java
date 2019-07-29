class Solution {
    int maxR, maxC, max;
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        maxR=matrix.length;
        maxC=matrix[0].length;
        max=1;
        int[][] f = new int[maxR][maxC];
        for(int i=0;i<maxR;i++){
            for(int j=0;j<maxC;j++){
                int x=dfs(matrix, i, j, Integer.MIN_VALUE, f);
                max=Math.max(max, x);
            }
        }
        return max;
    }
    public int dfs(int[][] matrix, int i, int j, int last, int[][] f){
        if(i<0||j<0||j>=maxC||i>=maxR||matrix[i][j]<=last) return 0;
        if(f[i][j]!=0) return f[i][j];
        int y=0;
        y=Math.max(y,dfs(matrix, i+1, j, matrix[i][j], f));
        y=Math.max(y,dfs(matrix, i-1, j, matrix[i][j], f));
        y=Math.max(y,dfs(matrix, i, j+1, matrix[i][j], f));
        y=Math.max(y,dfs(matrix, i, j-1, matrix[i][j], f));
        f[i][j]=1+y;
        return f[i][j];
    }
}

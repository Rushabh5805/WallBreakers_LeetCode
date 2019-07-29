class Solution {
    int count, maxR, maxC;
    public int islandPerimeter(int[][] grid) {
        count=0;
        maxR=grid.length;
        maxC=grid[0].length;
        int[][] visited = new int[maxR][maxC];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){    
                dfs(grid, visited, i,j);
            }
        }
        return count;
    }
    public void dfs(int[][] grid, int[][] visited, int i, int j){
        if(i<0||i>=maxR||j<0||j>=maxC) return;
        if(grid[i][j]==0||visited[i][j]==1){
            visited[i][j]=1;
            return;
        }
        if(grid[i][j]==1){
            count+=4;
            if(i-1>=0&&grid[i-1][j]==1&&visited[i-1][j]==1) count-=2;
            if(i+1<maxR&&grid[i+1][j]==1&&visited[i+1][j]==1) count-=2;
            if(j-1>=0&&grid[i][j-1]==1&&visited[i][j-1]==1) count-=2;
            if(j+1<maxC&&grid[i][j+1]==1&&visited[i][j+1]==1) count-=2;
        }
        visited[i][j]=1;
        dfs(grid, visited, i+1,j);
        dfs(grid, visited, i-1,j);
        dfs(grid, visited, i,j+1);
        dfs(grid, visited, i,j-1);
    }
}

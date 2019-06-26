class Solution {
    public int numIslands(char[][] grid) {
         if(grid.length==0)
            return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int island=0;
       
        //System.out.println(visited[0][0]);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j]&&grid[i][j]=='1'){
                    island++;
                    dfs(visited, grid, i, j);
                }
            }
        }
        return island;
        
    }
    public void dfs(boolean[][] visited, char[][] grid,int i,int j){
        if(i<0||j<0||j>grid[0].length-1||i>grid.length-1||grid[i][j]!='1'||visited[i][j])
            return;
        //if(grid[i][j]=='1'){
        visited[i][j]=true;
        dfs(visited, grid, i, j-1);
        dfs(visited, grid, i, j+1);
        dfs(visited, grid, i+1, j);
        dfs(visited, grid, i-1, j);
        //}
    }
}

class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(colors[i]==0 && !dfs(graph, colors, 1, i)){
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int[][] graph, int[] colors, int color, int node){
        if(colors[node]!=0)
            return colors[node]==color;
        else{
            colors[node]=color;
            for(int x : graph[node]){
                if(!dfs(graph, colors, -color, x))
                    return false;
            }
        }
        return true;
    }
}

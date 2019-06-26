class UnionFind {
    private int[] parents;
    private int circleCount;
    
    public UnionFind(int n){
        parents = new int[n];
        
        for(int i=0;i<n;i++){
            parents[i] = i;
        }
    }
    
    public int find(int n){
        if(parents[n]==n)
            return n;
        
        return parents[n] = find(parents[n]);
    }
    
    public void union(int i, int j){
        int groupA = find(i);
        int groupB = find(j);
        
        if(groupA != groupB){
            parents[groupA]=groupB;
            circleCount--;
        }
    }
    
    public void setCount(int n){
        circleCount=n;
    }
    public int getCount(){
        return circleCount;
    }
}

class Solution {
    public int findCircleNum(int[][] M) {
        int m= M.length;
        UnionFind uf = new UnionFind(m*m);
        uf.setCount(m);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==1 && i!=j){
                    uf.union(i,j);
                }
            }
        }
        return uf.getCount();
    }
}

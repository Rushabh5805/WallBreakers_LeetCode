class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        HashSet<String> set = new HashSet<>();
        for(String wo : words){
            char[] w = wo.toCharArray();
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(w[0]==board[i][j])
                        if(dfs(board, i, j, w, 0)) set.add(wo);
                }
            }
        }
        return new ArrayList(set);
    }
    
    public boolean dfs(char[][] board, int i, int j, char[] w, int ind){
        if(ind==w.length) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length) return false;
        if(board[i][j]!=w[ind]) return false;
        board[i][j]^=256;
        boolean exist = dfs(board, i,j+1,w,ind+1)||dfs(board, i,j-1,w,ind+1)||dfs(board, i+1,j,w,ind+1)||dfs(board, i-1,j,w,ind+1);
        board[i][j]^=256;
        
        return exist;
    }   
}

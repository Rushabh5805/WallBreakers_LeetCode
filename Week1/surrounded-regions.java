class Solution {
    public void solve(char[][] board) {
        if(board.length==0)
            return;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O')
                    board[i][j]='-';
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='-')
                change(board,0,i);
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='-')
                change(board,i,0);
        }
        for(int i=0;i<board[0].length;i++){
            if(board[board.length-1][i]=='-')
                change(board,board.length-1,i);
        }
        for(int i=0;i<board.length;i++){
            if(board[i][board[0].length-1]=='-')
                change(board,i,board[0].length-1);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='-')
                    board[i][j]='X';
            }
        }
    }
    
    public void change(char[][] board, int i, int j){
        if(i<0||j<0||i>board.length-1||j>board[0].length-1||board[i][j]=='X'||board[i][j]=='O')
            return;
        board[i][j]='O';
        change(board, i-1, j);
        change(board, i+1, j);
        change(board, i, j-1);
        change(board, i, j+1);
    }
    
}

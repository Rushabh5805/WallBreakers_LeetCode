class Solution {
    public void solveSudoku(char[][] board) {
        solveSudokuCell(0, 0, board);
    }
    public boolean solveSudokuCell(int i, int j, char[][] board){
        if(j>=board.length){
            i++;
            j=0;
        }
        if(i==board.length)
            return true;
        if(board[i][j]!='.')
            return solveSudokuCell(i, j+1, board);
        for(int val = 1;val<=board.length;val++){
            char c = (char) (val+'0');
            
            if(validSudoku(i, j, board, c)){
                board[i][j]=c;
                if(solveSudokuCell(i, j+1, board))
                    return true;
            }
        }
        
        board[i][j]='.';
        return false;
    }
    
    public boolean validSudoku(int i, int j, char[][] board, char c){
        for(int x=0;x<board.length;x++){
            if(board[x][j]==c)
                return false;
            if(board[i][x]==c)
                return false;
        }
        int y=i/3;
        int z=j/3;
        y*=3;
        z*=3;
        for(int r = y;r<y+3;r++){
            for(int s = z;s<z+3;s++){
                if(board[r][s]==c)
                    return false;
            }
        }
        return true;
    }
    
}

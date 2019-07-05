class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(!map.containsKey(board[i][j])){
                    map.put(board[i][j],1);
                }
                else if(board[i][j]!='.'){
                    System.out.println("1");
                    return false;
                }
            }
            map.clear();
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(!map.containsKey(board[j][i])){
                    map.put(board[j][i],1);
                }
                else if(board[j][i]!='.'){
                    System.out.println("2");
                    return false;
                }
            }
            map.clear();
        }
        for(int i=0;i<board.length;i=i+3){
            for(int j=0;j<board.length;j=j+3){
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        if(!map.containsKey(board[k+i][l+j])){
                            map.put(board[k+i][l+j],1);
                        }
                        else if(board[k+i][l+j]!='.'){
                            System.out.println(board[k+i][l+j]);
                            return false;
                        }
                    }
                }
                map.clear();
            }
        }
        return true;
    }
}

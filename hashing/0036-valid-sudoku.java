class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> sets = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if((!sets.add(board[i][j]+"row"+i)) || (!sets.add(board[i][j]+"col"+j))||(!sets.add(board[i][j]+"box"+i/3+"-"+j/3))){
                        System.out.print(board[i][j]);
                    return false;
                }
                }
            }
        }
        return true;
    }
}
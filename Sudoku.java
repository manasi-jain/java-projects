public class Sudoku{
    
    public boolean isSafe(char[][] board, int row, int col, int number){
        //row & col
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(number + '0')) {
                return false;
            }    
            if(board[row][i] == (char)(number + '0')) {
                return false;
            }
        }

        //grid
        int startRow = (row/3) * 3;
        int startCol = (col/3) * 3;

        for(int p=startRow; p<startRow+3; p++) {
            for(int q=startCol; q<startCol+3; q++) {
                if(board[p][q] == (char)(number + '0')) {
                    return false;
                }
            }
        }
        return true;    
    }

    public boolean helper(char[][] board, int row, int col) {
        
        if(row == board.length){
            return true;
        }

        int newRow=0;
        int newCol=0;
        if(col != board.length -1) {
            newRow = row;
            newCol = col + 1;
        } else {
            newRow = row + 1;
            newCol = 0;
        }
         
        if(board[row][col] != '.') {
            if(helper(board, newRow, newCol)){
                return true;
            } else {
                for(int i=1; i<=9; i++) {
                    if(isSafe(board, row, col, i)) {
                        board[row][col] = (char)(i + '0');
                        if(helper(board, newRow, newCol)) {
                            return true;
                        } else {
                            board[row][col] = '.';
                        }
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

}
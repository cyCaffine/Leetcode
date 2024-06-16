class Solution {

    // Function to check if it's safe to place a number at a specific position
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check the row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char)(number + '0')) {
                return false;
            }
            if (board[row][i] == (char)(number + '0')) {
                return false;
            }
        }
        // Check the 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    // Helper function to solve the Sudoku puzzle using backtracking
    public boolean helper(char[][] board, int row, int col) {
        // If we have reached the end of the board, return true (base case)
        if (row == board.length) {
            return true;
        }

        // Calculate the new row and column positions
        int newrow = row;
        int newcol = col;
        if (col != board.length - 1) {
            newcol = col + 1;
        } else {
            newrow = row + 1;
            newcol = 0;
        }

        // If the current cell is not empty, move to the next cell
        if (board[row][col] != '.') {
            return helper(board, newrow, newcol);
        } else {
            // Try placing numbers 1 to 9 in the current cell
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i + '0');
                    if (helper(board, newrow, newcol)) {
                        return true;
                    } else {
                        board[row][col] = '.'; // Undo the move (backtrack)
                    }
                }
            }
        }
        return false; // Trigger backtracking if no number is valid
    }

    // Main function to solve the Sudoku puzzle
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}

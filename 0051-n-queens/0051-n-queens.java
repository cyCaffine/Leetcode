import java.util.ArrayList;
import java.util.List;

class Solution {

    // Helper function to check if it's safe to place a queen at board[row][col]
    public boolean isSafe(char[][] board, int row, int col) {
        // Check the row on the left side
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        
        // Check the column on the upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the lower left diagonal
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the lower right diagonal
        for (int i = row, j = col; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Helper function to convert the board to a list of strings and save it
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                row += board[i][j];
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    // Helper function to place queens on the board
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        // Base case: if all columns are filled, save the board configuration
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        // Try placing a queen in each row for the current column
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place the queen
                helper(board, allBoards, col + 1); // Recurse to place queens in the next column
                board[row][col] = '.'; // Remove the queen (backtrack)
            }
        }
    }

    // Main function to solve the N-Queens problem
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }
}

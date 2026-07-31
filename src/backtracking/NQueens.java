package backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        generate(board, n, 0, result);

        return result;
    }

    static void generate(char[][] board, int n, int row, List<List<String>> result) {

        if(row == n) {
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            result.add(temp);
            return;
        }

        for(int col = 0; col < n; col++) {
            if(isValid(board, n, row, col)) {
                board[row][col] = 'Q';
                generate(board, n, row + 1, result);
                board[row][col] = '.';
            }
        }
    }

    static boolean isValid(char[][] board, int n, int row, int col) {
        // vertical
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // up left
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // up right
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    
}

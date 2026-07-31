package backtracking;

public class WordSearch {
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        char[][] board = {{'a', 'b', 'c', 'e'}, {'s', 'f', 'c', 's'}, {'a', 'd', 'e', 'e'}};
        boolean check = exist(board, "seed");
        System.out.println(check);
    }


    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean check = false;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0) && find(board, word, i, j, m, n, 0)){
                    return true;
                }

            }
        }

        return false;
    }

    public static boolean find(char[][] board, String word, int row, int col, int m, int n, int idx) {
        if(idx == word.length()) {
            return true;
        }

        if(row < 0 || row >= m || col < 0 || col >= n || board[row][col] == '$'){
            return false;
        }


        if(board[row][col] == word.charAt(idx)) {
            char temp = board[row][col];
            board[row][col] = '$';
            for(int i = 0; i < 4; i++) {
                int newR = row + dr[i];
                int newC = col + dc[i];

                if(find(board, word, newR, newC, m, n, idx+1)){
                    return true;
                }
            }

            board[row][col] = temp;
        }
        return false;

    }
}

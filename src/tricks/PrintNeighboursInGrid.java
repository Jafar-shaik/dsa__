package tricks;
// Not a leetcode problem
public class PrintNeighboursInGrid {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        String[] directions = {"UP", "DOWN", "LEFT", "RIGHT"};
        int m = grid.length;
        int n = grid[0].length;
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                System.out.println("Printing neighbours of " + grid[row][col]);
                for (int i = 0; i < 4; i++) {
                    int newRow = row + dr[i];
                    int newCol = col + dc[i];
                    if(newRow < m && newCol < n && newRow >= 0 && newCol >= 0) {
                        System.out.println("For the " + directions[i] + " The neighbour is " + grid[newRow][newCol]);
                    }else{
                        System.out.println("For the " + directions[i] + " There is no neighbour");
                    }
                }
                System.out.println("......................................");
            }
        }
    }
}

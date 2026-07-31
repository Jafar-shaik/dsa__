package recursion;

public class FloodFill {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) {
        int[][] image = {{1,1,1}, {1,1,0}, {1,0,1}};
        int sr = 1, sc = 1, color = 2;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        floodFill(image, sr, sc, color);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        int m = image.length;
        int n = image[0].length;
        fill(image, sr, sc, color, image[sr][sc], m, n);
        return image;
    }

    static void fill(int[][] image, int sr, int sc, int col, int bp, int m, int n) {
        if(sr < 0 || sr >= m || sc < 0 || sc >= n) {
            return;
        }

        if(image[sr][sc] == bp) {
            image[sr][sc] = col;
            for(int i = 0; i < 4; i++) {
                int newSr = sr + dr[i];
                int newSc = sc + dc[i];
                fill(image, newSr, newSc, col, bp, m, n);
            }
        }
    }
}

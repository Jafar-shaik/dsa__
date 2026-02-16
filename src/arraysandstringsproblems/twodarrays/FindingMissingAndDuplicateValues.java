package arraysandstringsproblems.twodarrays;

public class FindingMissingAndDuplicateValues {
    public static void main(String[] args) {
        int[][] grid = {
                {9,1,7},
                {8,9,2},
                {3,4,6}
        };
        findMissingAndDuplicateValues(grid);
        
    }
    
    public static void findMissingAndDuplicateValues(int[][] grid){
        int expSum = 0, actSum = 0;
        int missNum = 0, repNum = 0;
        int n = grid.length;
        System.out.println(n);
        int N = n*n;
        int[] freq = new int[N+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;         // for i = 0 , j = 0  => grid[i][j] = 9    => freq[9]++
            }
        }

        for(int i = 1; i <= N; i++){
            if(freq[i] == 2){
                repNum = i;
            }
            if(freq[i] == 0){
                missNum = i;
            }
        }
        System.out.println(repNum +", "+missNum);
    }
}

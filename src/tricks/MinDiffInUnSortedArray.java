package tricks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MinDiffInUnSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,15};
        findMinDiff(arr);
    }
    public static void findMinDiff(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
        }
        System.out.println(minDiff);
        for(int i = 1; i < arr.length; i++){
            int check = arr[i] - arr[i-1];
            if(minDiff == check){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        System.out.println(result);
    }
}

package arraysandstringsproblems;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        List<List<Integer>> result = minimumAbsDifference(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
        }

        for(int i = 1; i < arr.length; i++){
            int check = arr[i] - arr[i-1];
            if(minDiff == check){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result;
    }
}

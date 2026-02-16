package prefix;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class SumOfQSubArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] prefix = new int[nums.length];
        int[][] queries = {{1,2},{4,7}, {0,9}};
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        List<Integer> result = new ArrayList<>();
        for(int[] q : queries){
            int left = q[0];
            int right = q[1];

            if(left == 0) result.add(prefix[right]);
            else{
                int sum = prefix[right] - prefix[left-1];
                result.add(sum);
            }
        }
        System.out.println(result);

    }

}

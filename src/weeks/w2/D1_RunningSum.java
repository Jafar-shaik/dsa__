package weeks.w2;
import java.util.Arrays;
public class D1_RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
}

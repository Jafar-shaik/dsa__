package prefix;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] answer = new int[n];
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        sufix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufix[i] = sufix[i + 1] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                answer[0] = sufix[1];
            } else if (i == n - 1) {
                answer[i] = prefix[i - 1];
            } else {
                answer[i] = prefix[i - 1] * sufix[i + 1];
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}

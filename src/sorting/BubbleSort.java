package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {10, 6, 3, 44, 5, 3, 4};
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    count++;
                }
            }
        }

        System.out.println("The number of swaps is : " + count + " And the resultant array is :" + Arrays.toString(nums));
    }
}

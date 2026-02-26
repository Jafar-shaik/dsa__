package twopointers.oppositedirection;

import java.util.Arrays;

public class SortedSquaresArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = findSortedSquare(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findSortedSquare(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = nums[i] * nums[i];
        }

        int left = 0, right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if(nums[left] > nums[right]){
                result[i] = nums[left];
                left++;
            }else {
                result[i] = nums[right];
                right--;
            }
        }
        return result;
    }
}

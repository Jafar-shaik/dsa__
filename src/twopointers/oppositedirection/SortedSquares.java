package twopointers.oppositedirection;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,2,3};
        int[] result = squares(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] squares(int[] nums){
        int left = 0, right = nums.length-1;
        int pos = nums.length-1;
        int[] result = new int[nums.length];
        while(left <= right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            }
            else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return result;
    }
}







// arr1-                -4,-1,0,2,3
// arr2- 16,1,0,4,9
// sort
// arr2- 0,1,4,9,16


//
















package tricks;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        findMaxSum(arr,3);
    }
    static void findMaxSum(int[] nums, int k){
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }maxSum = sum;
        int start = 1, end = k;
        while(end < nums.length){
            sum += nums[k] - nums[start-1];
            maxSum = Math.max(sum,maxSum);
            start++;
            end++;
        }
        System.out.println(maxSum);
    }
}

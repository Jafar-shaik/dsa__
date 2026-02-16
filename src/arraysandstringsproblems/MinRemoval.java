package arraysandstringsproblems;

import java.util.Arrays;

public class MinRemoval {
    public static void main(String[] args) {
        int[] nums = {1,6,2,9};
        int k = 1;
        int ans = findMinRemoval(nums, k);
        System.out.println(ans);

    }

    public static int findMinRemoval(int nums[], int k){
        int n = nums.length;
        if(n <= 1) return 0;
        int maxBal = 1;
        int i = 0;
        Arrays.sort(nums);
        for(int j = 0; j < n; j++){
            while(nums[j] > nums[i] * k){
                i++;
            }
            maxBal = Math.max(maxBal, j - i + 1);
        }
        return n - maxBal;
    }
}

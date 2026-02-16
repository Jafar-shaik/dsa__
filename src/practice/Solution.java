package practice;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,6,2,9};
        int k = 3;
        find(nums, k);
    }

    public static void find(int[] nums, int k){
        Arrays.sort(nums);
        int n = nums.length;
        int maxBalance = 1;
        int i = 0;
        for(int j = 0; j < n; j++){
            while(nums[j] > nums[i] * k){
                i++;
            }
            maxBalance = Math.max(maxBalance, j - i + 1);
        }
        int ans = n - maxBalance;
        System.out.println(maxBalance);
    }
}
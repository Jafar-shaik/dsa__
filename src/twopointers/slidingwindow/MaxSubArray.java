package twopointers.slidingwindow;

public class MaxSubArray {
    public static void main(String args[]){
        int[] arr = {2, 1, 5, 1, 3, 2};
        findMaxSum(arr, 3);
    }
   static void findMaxSum(int[] arr, int k){
        int maxSum = 0, currentSum = 0;
        for(int i=0; i < k; i++){
            currentSum += arr[i];
        }
        int start = 0, end = k;
        while(end < arr.length){
            currentSum += arr[end]-arr[start];
            maxSum = Math.max(maxSum, currentSum);
            start++;
            end++;
        }
       System.out.println(maxSum);
   }
}



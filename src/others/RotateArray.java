package others;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr,3);
    }

    static void reverse(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        rotate(arr,0,n-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);

        System.out.println(Arrays.toString(arr));

    }
    static void rotate(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

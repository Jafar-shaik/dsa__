package sorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {38, 27, 43, 3, 9, 82, 10};
        System.out.println(Arrays.toString(nums));

        doMergeSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public  static void doMergeSort(int[] nums, int start, int end) {

        if(start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        doMergeSort(nums, start, mid);
        doMergeSort(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while(i <= mid && j <= end) {
            if(nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = nums[i++];
        }

        while(j <= end) {
            temp[k++] = nums[j++];
        }

        for(int x = 0; x < temp.length; x++) {
            nums[start + x] = temp[x];
        }
    }
}

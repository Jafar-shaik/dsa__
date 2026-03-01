package sorting;
import java.util.Arrays;

// Dutch National Flag Algo

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1, 0};
        doSortColors(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void doSortColors(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 0){
                int temp = nums[low] ;
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 1) {
                mid++;
            }else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}

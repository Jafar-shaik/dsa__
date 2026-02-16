package twopointers.samedirection;
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums= {3,1,3,2,3,3,4,5,6,3,2};
//        int len = removeVal(nums,3);
        int len = remove(nums,3);

        System.out.println(Arrays.toString(Arrays.copyOf(nums,len)));
    }
    static int remove(int[] nums, int val){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    static int removeVal(int[] arr, int val){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[index] = arr[i];
                index ++;
            }
        }
        return index;
    }
}

package twopointers.samedirection;
import java.util.Arrays;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0,2,3,0,1,2,0,0,0,4};
        zerosEnd(nums);
//        int len = moveZeros(nums);
//        System.out.println(Arrays.toString(Arrays.copyOf(nums,len)));
    }
    static int moveZeros(int[] nums){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        return index;
    }

    static void zerosEnd(int[] arr){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



//Input: nums = [1,0,1,0,3,12]


//Output: [1,3,12,0,0]
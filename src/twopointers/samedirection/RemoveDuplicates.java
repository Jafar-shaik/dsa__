package twopointers.samedirection;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,4,4,5,5,6,7};
        int len = remove(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,len)));
    }
    static int remove(int[] nums){
        int index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1]!=nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}

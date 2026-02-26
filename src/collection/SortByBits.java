package collection;

import java.util.Arrays;

public class SortByBits {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8};
        int[] result = doSortByBits(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] doSortByBits(int[] nums){
        Integer[] result = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }

        Arrays.sort(result, (a,b)->{
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if(countA == countB){
                return (a-b);
            }
            return countA - countB;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        return nums;
    }
}

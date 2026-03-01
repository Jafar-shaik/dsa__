package practice;
import java.util.*;

public class Prac_2 {
    public static void main (String[] args) throws java.lang.Exception{
        int nums[] ={0, 2, 1, 2, 0, 1, 0};
        int k = 2;
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        //write code...

        int zero = 0, one = 0, two = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }else if (nums[i] == 1){
                one++;
            } else{
                two++;
            }
        }

        for(int i = 0; i < zero; i++){
            nums[i] = 0;
        }
        for(int i = zero; i < one + zero; i++){
            nums[i] = 1;
        }
        for(int i = one + zero; i < nums.length; i++){
            nums[i] = 2;
        }
    }

}

//3 5
//1 4
//2 5
//6 4

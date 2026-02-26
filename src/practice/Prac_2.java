package practice;
import java.util.*;

public class Prac_2 {
    public static void main(String[] args) {
        //code here...

        int[] nums = {10, 5, 2, 7, 1, 9};
        int t = 15;
        int max = 0;
        int start = 0, end = 1;
        int sum = nums[start] + nums[end];
        while (end < nums.length){
            if(sum == t){
                max = Math.max(max, end - start + 1);
            }else if(sum > t){
                start++;
            }else {
                end++;
            }

        }

    }
}

//3 5
//1 4
//2 5
//6 4

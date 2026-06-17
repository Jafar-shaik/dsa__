package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prac_2 {
    public static void main (String[] args) {
        int[] nums = {1, 2, 3};
        int total = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i] * (n - i) * (i + 1);
        }
        System.out.println(total);
    }
}


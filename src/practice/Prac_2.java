package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prac_2 {
    public static void main (String[] args) throws java.lang.Exception{
        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        find(nums1,nums2);
    }
    public static void find(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> nums = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < m; i++){
            if(set.contains(nums2[i])){
                nums.add(nums2[i]);
            }
        }

        int arr[] = new int[nums.size()];
        int i = 0;
        for (int num : nums) {
            arr[i] = num;
            i++;
        }
//        return arr;
        System.out.println(Arrays.toString(arr));

    }
}

//3 5
//1 4
//2 5
//6 4

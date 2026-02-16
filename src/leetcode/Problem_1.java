package leetcode;

import java.util.Arrays;

public class Problem_1 {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3, n = nums2.length;

//        bruteForce(nums1,m,nums2,n);
//        twoPointer1(nums1,m,nums2,n);
        twoPointer2(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));



    }
    static void bruteForce(int[] nums1, int m, int[] nums2, int n){
        int[] nums3 = new int[m+n];
        for(int i = 0; i < m; i++){
            nums3[i] = nums1[i];
        }
        for(int i = m; i < m+n; i++){
            nums3[i] = nums2[i-m];
        }
        Arrays.sort(nums3);
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = nums3[i];
        }
    }

    static void twoPointer1(int[] nums1, int m, int[] nums2, int n){
        int[] result = new int[m+n];
        int a = 0, b = 0, index = 0;
        while(a < m && b < n){
            if(nums1[a] <= nums2[b]){
                result[index] =nums1[a];
                a++;
            }else{
                result[index] = nums2[b];
                b++;
            }
            index++;
        }
        while(a < m){
            result[index] = nums1[a];
            a++;
            index++;
        }
        while(b < n){
            result[index] = nums2[b];
            b++;
            index++;
        }

        for(int i = 0; i < result.length; i++){
            nums1[i] = result[i];
        }

    }
    static void twoPointer2(int[] nums1, int m, int[] nums2, int n){
        int a = m-1, b = n-1, index = m+n-1;
        while(a >= 0 && b >= 0){
            if(nums1[a] >= nums2[b]){
                nums1[index] = nums1[a];
                a--;
            }else{
                nums1[index] = nums2[b];
                b--;
            }
            index--;
        }
        while(b >= 0){
            nums1[index] = nums2[b];
            b--;
            index--;
        }
    }
}

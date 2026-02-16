package practice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Prac_1 {
    public static void main(String[] args) {
//        int nums[] = {3,2,2,5,4};
//        HashSet<Integer> evenSet = new HashSet<>();
//        HashSet<Integer> oddSet = new HashSet<>();
//
//        int n = nums.length;
//        int maxLen = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = i; j < n; j++){
//                if(nums[j] % 2 == 0){
//                    evenSet.add(nums[j]);
//                }else{
//                    oddSet.add(nums[j]);
//                }
//
//                if(evenSet.size() == oddSet.size()) maxLen = Math.max(maxLen, j - i + 1);
//            }
//        }
//
//        System.out.println(maxLen);
        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 3) {
                    break;
                }
            }
            count += 1;
        }
        System.out.println(count);
    }


}

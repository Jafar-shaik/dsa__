package practice;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        char a = 'a';
        int num = (int) a;
        System.out.println(num);
        ngl();
    }

//    public static void ngl(char[] letters, char target){
    public static void ngl(){
//        int t1 = (int) target;
        int tg = 9;
        int[] nums = {1,3,5,7,9};
        int left = 0, right = nums.length;
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == tg){
                ans = nums[mid];
            } else if (nums[mid] < tg) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
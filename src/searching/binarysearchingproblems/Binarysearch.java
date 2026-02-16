package searching.binarysearchingproblems;

public class Binarysearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,8,9,10};
        findBinarysearch(nums, 2);
    }
    public static void findBinarysearch(int[] nums, int target){
        int ans = -1;
        int left = 0, right = nums.length-1, mid = -1;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println(nums[mid]);
    }
}

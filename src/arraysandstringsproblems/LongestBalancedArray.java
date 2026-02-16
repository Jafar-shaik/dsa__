package arraysandstringsproblems;

import java.util.HashSet;

public class LongestBalancedArray {
    public static void main(String[] args) {
        int nums[] = {2,5,4,3};
        int length = findLongestBalancedArray(nums);
        System.out.println(length);

    }

    public static int findLongestBalancedArray(int[] nums){
        if(nums.length <= 1) return 0;
        int n = nums.length;
        int maxL = 0;
        for(int i = 0; i < n; i++){
            HashSet<Integer> evenSet = new HashSet<>();
            HashSet<Integer> oddSet = new HashSet<>();
            for(int j = i; j < n; j++){
                if(nums[j] % 2 == 0){
                    evenSet.add(nums[i]);
                }else{
                    oddSet.add(nums[i]);
                }
                if(evenSet.size() == oddSet.size()){
                    maxL = Math.max(maxL, j - i + 1);
                }
            }
        }
        return maxL;
    }
}

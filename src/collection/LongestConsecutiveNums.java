package collection;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNums {
    public static void main(String[] args) {
        int nums[] ={50, 3, 2, 1, 4, 9, 6};
        find(nums);
    }
    public static void find(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        for(int i = 0; i < set.size(); i++) {
            int prev = nums[i] - 1;
            if(set.contains(prev)){
                continue;
            }else{
                int len = 1;
                int nextEle = nums[i] + 1;
                while(set.contains(nextEle)){
                    len++;
                    nextEle++;
                }
                max = Math.max(max, len);
            }
        }
        System.out.println(max);
    }
}

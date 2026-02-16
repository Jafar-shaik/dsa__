package hashmaps;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] pairs = findPairs(nums, target);
        System.out.println(Arrays.toString(pairs));

    }

    public static int[] findPairs(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(map.containsKey(need)) return new int[] {map.get(need), i};
            map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }


}

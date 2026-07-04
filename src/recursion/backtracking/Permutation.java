package recursion.backtracking;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Permutation {
    public static HashSet<Integer> mySet = new HashSet<>();
    public static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        generate(nums, new ArrayList<>());
        System.out.println(result);
    }

    public static void generate(int[] nums, List<Integer> curr) {
        if(nums.length == curr.size()) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!mySet.contains(nums[i])) {
                curr.add(nums[i]);
                mySet.add(nums[i]);
                generate(nums, curr);

                mySet.remove(nums[i]);
                curr.remove(curr.size() - 1);
                generate(nums, curr);
            }
        }
    }


}

package recursion.backtracking;

import java.util.ArrayList;

public class PrintAllSubSets11 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), allSubsets);
        System.out.println(allSubsets);
    }

    static void generate(int[] nums, int i, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> allSubsets){

        if(i == nums.length) {
            allSubsets.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        generate(nums, i + 1, curr, allSubsets);

        curr.remove(curr.size()- 1);
        int idx = i + 1;
        while (idx < nums.length && nums[idx] == nums[idx - 1]){
            idx++;
        }
        generate(nums, idx, curr, allSubsets);


    }
}

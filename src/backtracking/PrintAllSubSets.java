package backtracking;
import java.util.ArrayList;

public class PrintAllSubSets {
    static ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        generateSubSets(nums, 0, new ArrayList<>());
        System.out.println(subsets);

    }

    public static void generateSubSets(int[] nums, int i, ArrayList<Integer> currList) {
        if(i == nums.length) {
            subsets.add((ArrayList<Integer>) currList.clone());
            return;
        }

        // Including all elements in array
        currList.add(nums[i]);
        generateSubSets(nums, i + 1, currList);

        //BackTracking...
        currList.remove(currList.size() - 1);
        generateSubSets(nums, i + 1, currList);

    }
}

/*

 */
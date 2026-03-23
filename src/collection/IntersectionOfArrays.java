package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;



public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,4};
        int[] nums2 = {1,1,3};
        find(nums1, nums2);

    }

    public static void find(int[] nums1, int[] nums2){
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int num : nums1){
            table.put(num, table.getOrDefault(num, 0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int num : nums2){
            if(table.containsKey(num) && table.get(num) != 0){
                result.add(num);
                table.put(num, table.get(num) - 1);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}

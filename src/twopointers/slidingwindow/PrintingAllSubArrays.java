package twopointers.slidingwindow;

public class PrintingAllSubArrays {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        for (int k = 1; k <= nums.length; k++) {
            System.out.println("The sub arrays of lingth k : " + k);
            for(int point = 0; point < nums.length-k+1; point++){
                for(int i = point; i < point + k; i++){
                    System.out.print(nums[i]);
                }
                System.out.println();
            }
        }
    }
}
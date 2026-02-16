package prefix;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        int rightSum = 0, leftSum = 0;

        for (int num : nums){
            rightSum += num;
        }

        for(int i = 0; i < nums.length; i++){
            rightSum -= nums[i];

            if(rightSum == leftSum) System.out.println("The pivot index is " +i);;

            leftSum += nums[i];
        }
    }
}

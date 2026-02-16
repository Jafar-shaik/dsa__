package weeks.w2;

public class D3_MaxSum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum < 0) currSum = 0;
        }

        System.out.println(maxSum);
    }
}

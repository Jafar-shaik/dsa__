package twopointers.samedirection;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,6,4,1,3,1,5};
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        System.out.println(nums[fast]);

        slow = 0;
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        System.out.println(slow);
    }
}

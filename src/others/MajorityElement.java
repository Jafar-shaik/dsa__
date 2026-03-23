package others;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {5,5,2};
        findMajority(nums);
    }

    static void findMajority(int[] nums){
        int ans = nums[0], freq = 0;
        for(int num : nums){
            if(freq == 0){
                ans = num;
                freq++;
            }else if(ans == num){
                freq++;
            }else{
                freq--;
            }
        }
        System.out.println(ans);
    }
}

package tricks;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,7,8,5};
        int xor1 = 0;
        int xor2 = 0;

        findMissingNumber(nums);
    }

    static void findMissingNumber(int[] nums){
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i <= 8; i++){
            xor1 ^= i;
        }
        for(int num : nums){
            xor2 ^= num;
        }
        System.out.println(nums.length);

        int result = xor1^xor2;
        System.out.println(result);
    }
}


// XOR properties
// a^a = 0
// a^0 = a

// for loop1 xor1 = 0^1^2^3^4^5^6^7^8
// for loop2 xor2 = 1^2^3^6^7^8^5
// means - cancling numbers -- 1,2,3,5,7,8
//       - remaining numbers -- 0^4 so the missing number is 4
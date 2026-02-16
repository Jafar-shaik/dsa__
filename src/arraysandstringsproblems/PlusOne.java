package arraysandstringsproblems;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {8,9,9,9};
        int[] result = findPlusOne(digits);
        System.out.println((Arrays.toString(result)));

    }
    public static int[] findPlusOne(int[] digits){
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] + 1 != 10){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }
}

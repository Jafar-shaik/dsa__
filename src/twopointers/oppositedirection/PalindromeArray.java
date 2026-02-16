package twopointers.oppositedirection;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        checkArray(arr);
    }
    static void checkArray(int[] arr){
        int left = 0, right = arr.length-1;

        while(left < right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            }else{
                System.out.println("Not a Palindrome....!");
                return;
            }
        }
        System.out.println("Palindrome....!");
    }
}

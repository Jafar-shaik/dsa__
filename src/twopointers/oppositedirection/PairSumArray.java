package twopointers.oppositedirection;

public class PairSumArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        findSum(arr,8);
    }
    static void findSum(int[] arr, int val){
        int left = 0, right = arr.length-1;
        boolean found = false;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == val){
                System.out.println("The pair is ["+left+","+right+"]");
                found = true;
                left++;
                right--;
            } else if (sum < val) {
                left++;
            }else right--;
        }
        if(!found)
            System.out.println("The pair is not found ");

    }
}

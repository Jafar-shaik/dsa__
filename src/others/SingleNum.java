package others;

public class SingleNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3};
        int result = 0;

        for(int num : arr){
            result ^= num;
        }

        System.out.println(result);  // 4

    }
}

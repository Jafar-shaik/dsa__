package recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(findSumOfNNumbers(num));
    }

    public static int findSumOfNNumbers(int n) {
        if(n == 1){
            return n;
        }

        return n + findSumOfNNumbers(n  - 1);
    }
}

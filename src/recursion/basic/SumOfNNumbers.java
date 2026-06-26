package recursion.basic;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int num = 5;
        findSumOfNNumbers(num, 0);
    }

    public static void findSumOfNNumbers(int num, int sum) {
        if(num == 0){
            sum += num;
            System.out.println("final sum " + sum );
            return;
        }

        sum += num;
        findSumOfNNumbers(num - 1, sum);
        System.out.println(num);

    }
}

package recursion.basic;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int fiboNum = 7;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        findFibonacciSeries(num1, num2, fiboNum);
    }

    public static void findFibonacciSeries(int num1, int num2, int fiboNum) {
        if(fiboNum == 0) {
            return;
        }
        int c = num1 + num2;
        System.out.print(c + " ");
        findFibonacciSeries(num2, c, fiboNum - 1);

    }
}

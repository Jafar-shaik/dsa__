package others;

public class SwapNums {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap : a = " + a +", b = " + b);
        a = a ^ b; // a = 10 ^ 20
        b = a ^ b; // b = 10 ^ 20 ^ 20 --> b = 10
        a = a ^ b; // a = 10 ^ 20 ^ 10 --> a = 20
        System.out.println("After swap  : a = " + a + ", b = " + b);

    }
}

package geeksforgeeks;

public class ClosestNumber {
    public static void main(String[] args) {
        int n = -15, m = 6;
        int q = n / m;

        int n1 = q * m;

        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));

        if(Math.abs(n - n1) < Math.abs(n - n2)) System.out.println(n1);
        else System.out.println(n2);

    }
}


//Find Closest to n and Divisible by m
//Last Updated : 9 Jul, 2025
//Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.
//
//        Examples:
//
//Input: n = 13, m = 4
//Output: 12
//Explanation: 12 is the closest to 13, divisible by 4.
//
//Input: n = -15, m = 6
//Output: -18
//Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.
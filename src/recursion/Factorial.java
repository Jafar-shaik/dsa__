package recursion;

// this is just a basic...
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findFactorial(num));
    }

    public static int findFactorial(int n) {
        if(n == 1) {
            return n;
        }

        return n * findFactorial(n - 1);
    }
}


/*
    STEP - 1
        n = 5
        return 5 * findFactorial( 5 - 1) // STEP - 2 (24)

    STEP - 2 findFactorial(5 - 1)
        n = 4
        return 4 * findFactorial(4 - 1) // STEP - 3 (6)

    STEP - 3 findFactorial(3 - 1) // STEP - 3 (6)
        n = 3
        return 3 * findFactorial(3 - 1) // STEP - 4 (2)

    STEP - 4 findFactorial(3 - 1)
        n = 2
        return 2 * findFactorial(2 - 1) // STEP - 5 (1)

    STEP - 5 findFactorial(2 - 1)
        n = 1
        return 1;
 */
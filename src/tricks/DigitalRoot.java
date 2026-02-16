package tricks;
import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        long num = new Scanner(System.in).nextLong();
//        System.out.println((num - 1) % 9 +1);
        findNum(num);
    }
    static void findNum(long num){
        System.out.println((num -1) %9 +1);
    }
}




// formula is ((n-1) %9  +1)

// simple execution
// n = 4944

// s1 -- (n-1) --> 4943
// s2 --  %9   --> 2       [Hence there are chances of getting 0,1,2,3,4,5,6,7,8 numbers with %9]
// s3 -- +1    --> 3
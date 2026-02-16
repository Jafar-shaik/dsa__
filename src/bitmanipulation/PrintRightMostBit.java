package bitmanipulation;

public class PrintRightMostBit {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        findRightMostBit(n1);
        findRightMostBit(n2);

    }

    public static void findRightMostBit(int n){
        int ans = n & 1;
        System.out.println(ans);
    }
}


// Explanation:
// n = 3 --> 1 1 1


// n & 1 --> 1 1 1
//           0 0 1
//         = 0 0 1    --> 1




// n = 4 --> 1 0 0 0


// n & 1 --> 1 0 0 0
//           0 0 0 1
//         = 0 0 0 1   --> 0
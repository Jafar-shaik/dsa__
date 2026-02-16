package bitmanipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596; // 32 bit signed integer
        reverse(n);
    }

    public static void reverse(int n){
        int result = 0;
        for(int i = 1; i <= 32; i++){
            result <<= 1;
            result |= n & 1;
            n >>= 1;
        }
        System.out.println(result);
    }
}

// ans = 964176192

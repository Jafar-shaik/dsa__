package bitmanipulation;

public class NoOfSetPrimeBits {
    public static void main(String[] args) {
        int left = 6, right = 10;
        countPrimeSetBits(left, right);
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        while(left <= right){
            if(isPrime(left)){
                count++;
            }
            left++;
        }
        return count;
    }

    public static boolean isPrime(int num){
        int nsb = 0;
        while(num > 0){
            nsb += (num & 1);
            num >>= 1;
        }
        if( nsb == 2 || nsb == 3 || nsb ==  5 || nsb == 7 || nsb == 11 || nsb == 13 || nsb == 17 || nsb == 19){
            return true;
        }
        return false;
    }
}

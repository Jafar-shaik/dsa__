package tricks;

public class CheckPrime {
    public static void main(String[] args) {
        int num = 37;
        boolean isPrime = true;
        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0 ) {
                isPrime = false;
            }
        }

        System.out.println(isPrime);
    }
}

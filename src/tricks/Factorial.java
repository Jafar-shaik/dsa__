package tricks;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("The factorial of 4 is "+finFact( 4));
    }

    static int finFact(int n){

        if(n == 0 || n ==1){
            return 1;
        }

        int result = 1;
        result = n * finFact(n-1);
        return result;
    }
}

package bitmanipulation;

public class AlteringBits {
    public static void main(String[] args) {
        int n = 5; //  1 0 1
        boolean isAlter = true;

        while(n > 0){
            int last = n & 1;
            n >>= 1;
            if(last == (n & 1)){
                isAlter = false;
                break;
            }
        }
        System.out.println(isAlter ? "Yes" : "No");
    }
}

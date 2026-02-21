package twopointers.samedirection;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Using brute force "+ isHappy1(n)); // brute force time = O(logn), space = O(n)
        System.out.println("Using floyd cycle "+ isHappy2(n)); // floyd cycle time = O(logn), space = O(1)
    }

    public static boolean isHappy1(int n ){
        HashSet<Integer> usedIntgers = new HashSet<>();
        while(true){
            int sum = sumOfSquares(n);
            if(sum == 1) return true;
            n = sum;
            if(usedIntgers.contains(n)){
                return false;
            }
            usedIntgers.add(n);
        }

    }

    public static int sumOfSquares(int n){
        int sum = 0;
        while(n > 0){
            int snum = n % 10;
            sum += Math.pow(snum, 2);
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy2(int n){
        int slow = n, fast = n;
        while(true){
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
            if(fast == 1){
                return true;
            }
            if(fast == slow){
                return false;
            }
        }
    }
}

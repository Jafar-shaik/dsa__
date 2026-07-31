package recursion;

public class TowersOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        findTowersOfHanoi(n, 'A', 'B', 'C');
    }

    public  static void findTowersOfHanoi(int n, char src, char helper, char dest) {
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        findTowersOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        findTowersOfHanoi(n - 1, helper, src, dest);
    }
}

package others;
import java.util.ArrayList;
import java.util.Scanner;

public class TCSCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CASE 1
        // if size and elements are the array is given..
        System.out.println("Case 1");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

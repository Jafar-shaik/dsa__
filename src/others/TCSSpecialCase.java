package others;
import java.util.ArrayList;
import java.util.Scanner;

public class TCSSpecialCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SPECIAL CASE
        // if taking input integer and then string
        System.out.println("Special case");
        int ele = sc.nextInt();
        sc.nextLine();
        String str4 = sc.nextLine();
        System.out.println("The element is " + ele + " and the line is " + str4);

    }
}

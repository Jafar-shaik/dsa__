package others;
import java.util.ArrayList;
import java.util.Scanner;

public class TCSCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // CASE 2
        // if size is not given
        System.out.println("Case 2");
        String str1 = sc.nextLine(); // "1 2 3 4 5 6"
        String nums1[] = str1.split(" ");
        ArrayList<Integer> list1 = new ArrayList<>();
        for(String num : nums1) {
            list1.add(Integer.parseInt(num));
        }

        System.out.println("The elements are");
        for(int ele : list1) {
            System.out.print(ele + " ");
        }

    }
}

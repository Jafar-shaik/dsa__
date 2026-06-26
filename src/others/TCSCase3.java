package others;
import java.util.ArrayList;
import java.util.Scanner;

public class TCSCase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CASE 3
        // if size is not given and input is comma separated 1,2,3,4,5
        System.out.println("Case 3");
        String str2 = sc.nextLine();
        String[] nums2 = str2.split(",");
        ArrayList<Integer> list2 = new ArrayList<>();
        for(String num : nums2) {
            list2.add(Integer.parseInt(num));
        }
        System.out.println("The elements are");
        for(int ele : list2) {
            System.out.print(ele + " ");
        }

    }
}

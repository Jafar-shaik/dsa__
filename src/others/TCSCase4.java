package others;
import java.util.ArrayList;
import java.util.Scanner;

public class TCSCase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CASE 4
        // if size is not given and input is {1,2,3,4,5}
        System.out.println("Case 4");
        String str3 = sc.nextLine();
        if(str3.startsWith("{") && str3.endsWith("}")){
            str3 = str3.substring(1, str3.length() - 1);
        }

        String[] nums3 = str3.split(",");
        ArrayList<Integer> list3 = new ArrayList<>();
        for(String num : nums3) {
            list3.add(Integer.parseInt(num));
        }
        for(int ele : list3) {
            System.out.print(ele + " ");
        }

    }
}

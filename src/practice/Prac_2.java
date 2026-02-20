package practice;
import java.util.*;

public class Prac_2 {
    public static void main(String[] args) {
        //code here...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int num: nums){
            if(num > 0){
                pos.add(num);
            }else {
                neg.add(num);
            }
        }
        System.out.println(pos + ", "+neg);
        int pi = 1, ni = 0;
        nums[0] = pos.get(0);
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                nums[i] = pos.get(pi);
                pi++;
            }else{
                nums[i] = neg.get(ni);
                ni++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}

//3 5
//1 4
//2 5
//6 4

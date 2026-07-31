package backtracking;
import java.util.ArrayList;
import java.lang.*;
public class GenrateParantheses_1 {
    static ArrayList<StringBuilder> result = new ArrayList<>();

    public static void main(String[] args) {
        int n = 2;
        generate(new StringBuilder(), n);
        System.out.println(result);
    }

    static void generate(StringBuilder curr, int n) {

        if(curr.length() == n * 2) {
            if(isValid(curr.toString()))
                result.add(new StringBuilder(curr));
            return;
        }


        curr.append("(");
        generate(curr, n);
        curr.deleteCharAt(curr.length() - 1);

        curr.append(")");
        generate(curr, n);
        curr.deleteCharAt(curr.length() - 1);

    }

    static boolean isValid(String s) {
        int balance = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                balance++;
            }else{
                balance--;
            }

            if(balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }


}

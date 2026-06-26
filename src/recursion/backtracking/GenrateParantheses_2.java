package recursion.backtracking;

import java.util.ArrayList;

public class GenrateParantheses_2 {
    static ArrayList<StringBuilder> result = new ArrayList<>();

    public static void main(String[] args) {
        int n = 2;
        generate(new StringBuilder(), n, 0, 0);
        System.out.println(result);
    }

    static void generate(StringBuilder curr, int n, int open, int close) {

        if(curr.length() == n * 2) {
            result.add(new StringBuilder(curr));
            return;
        }


        if(open < n) {
            curr.append("(");
            generate(curr, n, open + 1, close);
            curr.deleteCharAt(curr.length() - 1);
        }

        if(close < open) {
            curr.append(")");
            generate(curr, n, open, close+1);
            curr.deleteCharAt(curr.length() - 1);
        }


    }
}

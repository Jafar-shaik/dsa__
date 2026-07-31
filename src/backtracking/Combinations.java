package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> result = new ArrayList<>();
        generate(1, k, n, new ArrayList<>(), result);
        System.out.println(result);
    }

    public static void generate(int start, int end, int n, List<Integer> curr, List<List<Integer>> result) {
        if(curr.size() == end) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if(start > n) {
            return;
        }

        curr.add(start);
        generate(start + 1, end, n, curr, result);

        curr.remove(curr.size() - 1);
        generate(start + 1, end, n, curr, result);

    }
}

package backtracking;
import java.util.*;

public class LetterComiOfPhone {
    static ArrayList<String> result = new ArrayList<>();
    static HashMap<Character, String> myMap = new HashMap<>();


    public static void main(String[] args) {
        myMap.put('2', "abc");
        myMap.put('3',"def");
        myMap.put('4',"ghi");
        myMap.put('5',"jkl");
        myMap.put('6',"mno");
        myMap.put('7',"pqrs");
        myMap.put('8',"tuv");
        myMap.put('9', "wxyz");
        String digits = "23";
        generate(digits, 0, "");
        System.out.println(result);
    }

    static void generate(String digits, int idx, String curr) {
        if(idx == digits.length()) {
            result.add(curr);
            return;
        }

        char ch = digits.charAt(idx);
        String s = myMap.get(ch);
        for(int i = 0; i < s.length(); i++) {
            curr +=(s.charAt(i));
            generate(digits, idx + 1, curr);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
}

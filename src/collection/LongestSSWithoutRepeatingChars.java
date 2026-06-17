package collection;
import java.util.HashSet;

public class LongestSSWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "abcabcbb";
        find(s);
    }

    public static void find(String s){
        HashSet<Character> set = new HashSet<>();
        int maxL = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxL = Math.max(maxL, right - left + 1);
        }
        System.out.println(maxL);
    }

}

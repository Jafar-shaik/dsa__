package arraysandstringsproblems;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String sentence = "  Jafar is good boyyyy    ";
        int count = 0, n = sentence.length();
        int index = n-1;
        while(index >= 0 && sentence.charAt(index) == ' '){
            index--;
        }

        while(index >= 0 && sentence.charAt(index) != ' '){
            index--;
            count++;
        }

        System.out.println(count);
    }
}

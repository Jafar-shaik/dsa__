package arraysandstringsproblems;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String sentence = "jafar is a very good boy   ";
        int count = 0, n = sentence.length();

        for(int i = n-1; i >= 0; i--){
            char ch = sentence.charAt(i);
            if(ch != ' '){
                count++;
            }else if(ch > 0){
                break;
            }
        }
        System.out.println(count);
    }
}

package practice;


public class Prac_1 {
    public static void main (String[] args) {
        String s = "p##";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            } else if(ch == '*' && sb.length() >= 1) {
                sb.deleteCharAt(sb.length() - 1);
            } else if(ch == '#' && sb.length() >= 1) {
                sb.append(sb.charAt(sb.length() - 1));
            }else {
                sb.reverse();
            }
        }

        System.out.println(sb);
    }
}



// # duplicate
// * remove
// % reverse
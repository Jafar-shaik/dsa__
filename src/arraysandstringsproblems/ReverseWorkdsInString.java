package arraysandstringsproblems;

public class ReverseWorkdsInString {
    public static void main(String[] args) {
        String s = "  the sky is blue    ";
        StringBuilder cb = new StringBuilder(s);
        String result = "";
        cb.reverse();
        for(int i = 0; i < cb.length(); i++){
            StringBuilder word = new StringBuilder("");
            if(cb.charAt(i) == ' ') continue;
            while(i < cb.length() && cb.charAt(i) != ' '){
                word.append(cb.charAt(i));
                i++;
            }
            word.reverse();
            if(!word.equals(' ')){
                result += " "+word;
            }
            System.out.println(word);

        }
        System.out.println(result.substring(1,result.length()));

    }
    public static String withoutStringBuilder(String s){
        String rev = reverseSt(s);
        String result = "";

        for(int i = 0; i < s.length(); i++){
            String word = "";
//            if(rev.charAt(i) == ' ') continue;
            while(i < s.length() && rev.charAt(i) != ' '){
                word += rev.charAt(i);
                i++;
            }

            String revWord = reverseSt(word);
            if(!word.equals(' ')) {
                result += " " + revWord;
            }
        }
        return result.substring(1, result.length());
    }

    public static String  reverseSt(String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

}


//the sky is blue
//blue is sky the
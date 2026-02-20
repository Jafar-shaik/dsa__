package arraysandstringsproblems;

public class FirstSubstring {
    public static void main(String[] args) {
        String heystack = "saidbutsad";
        String needle = "sad";
        strStr(heystack,needle);

    }

    public static void strStr(String heystack, String needle){
        for(int i = 0; i < heystack.length() - needle.length() + 1; i++){
            if(heystack.charAt(i) == needle.charAt(0)){
                if(heystack.substring(i, i+needle.length()).equals(needle)){
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}

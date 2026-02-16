package twopointers.oppositedirection;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s = "babad";
        findLongestPalindromicSubString(s);
    }
    public static void findLongestPalindromicSubString(String s){
        boolean check = true;
        int n = s.length();
        int wl = 0;
        String result = String.valueOf(s.charAt(0));
        for(int i = 0; i < n; i++){
            for(int j = n; j >= i; j--){
                int curr = 0;
                String ss = s.substring(i, j);
                check = isPalindrome(ss);
                curr = j - i + 1;
                if(check){
                    if(wl < curr){
                        wl = curr;
                        result = ss;
                    }
                }
            }
        }
        wl --;
        System.out.println(wl+", "+result);
    }

    public static boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        boolean check = true;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                check = false;
                break;
            }
        }
        return check;
    }
}

package weeks.w1;

public class D1_MinColors {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        int countW = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W'){
                countW++;
            }
        }
        int minW = countW;
        int start = 0, end = k;
        while(end < blocks.length()){
            if(blocks.charAt(start) == 'W'){
                countW--;
            }
            if(blocks.charAt(end) == 'W'){
                countW++;
            }
            minW = Math.min(minW, countW);
            end++;
            start++;
        }
        System.out.println(minW);
    }
}

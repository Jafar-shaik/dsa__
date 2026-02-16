package twopointers.slidingwindow;

public class MinColors {
    public static void main(String args[]){
        String blocks = "wbbwwbbwbw";
        findMinChange(blocks,7);
    }

    static void findMinChangge(String blocks, int k){

        int temp = 0;
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'w'){
                temp ++;
            }
        }
        int minW = temp;
        int start = 1, end = k;
        while(end < blocks.length()){
            if(blocks.charAt(start) == 'w'){
                temp --;
            }
            if(blocks.charAt(end) == 'w'){
                temp ++;
            }
            start ++;
            end ++;
            minW = Math.min(minW, temp);
        }
        System.out.println(minW);
    }

    static void findMinChange(String blocks, int k){
        int minB = 0;
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'b'){
                minB++;
            }
        }
        int temp = minB;
        int start = 1, end = k;
        while(end < blocks.length()){
            if(blocks.charAt(start) == 'b'){
                temp--;
            }
            if(blocks.charAt(end) == 'b'){
                temp++;
            }
            start++;
            end++;
            minB = Math.min(temp, minB);
        }
        System.out.println(minB);
    }
}


package arraysandstringsproblems;

public class IntegerToRoman {
    public static void main(String[] args) {
        findIntegerToRoman(2004);
    }
    public static void findIntegerToRoman(int num){
        int[] values = {
                1000,900,500,400,
                100,90,50,40,
                10,9,5,4,1
        };

        String[] symbols = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };

        String result = "";

        for (int i = 0; i < values.length; i++) {
            int curr = values[i];
            while(num >= curr){
                result = result+symbols[i];
                num -= curr;
            }
        }
        System.out.println(result);
    }
}

/*
    M = 1000
    D = 500
    C = 100
    L = 50
    X = 10
    V = 5
    I = 1
 */
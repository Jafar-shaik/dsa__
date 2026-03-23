package practice;

public class Prac_1 {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        finsqrt(60);


    }
    public static void finsqrt(int num){   // 36
        int mid = 0, left = 0, right = num;
        while(left <= right){
            mid = (left + right) / 2;

            if(mid*mid == num){
                break;
            }else if (mid * mid > num){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(mid);

    }
}



//1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36
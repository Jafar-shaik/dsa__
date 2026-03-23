package searching.binarysearchingproblems;

public class PerfectSqaures {
    public static void main(String[] args) {
        findsqrt(36);
    }
    public static void findsqrt(int num){
        int mid = 0, left = 0, right = num;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(mid * mid == num){
                break;
            }else if (mid * mid < num){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println(mid);
    }
}

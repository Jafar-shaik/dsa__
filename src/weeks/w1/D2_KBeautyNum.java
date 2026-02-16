package weeks.w1;

public class D2_KBeautyNum {
    public static void main(String[] args) {
        int num = 430043;
        int k = 2;
        int org = num;
        int digits = (int) Math.log10(num) + 1;
        int times = digits - k + 1;
        int count = 0;
        int tenk = (int)Math.pow(10,k);
        while(times > 0){
            int div = num % tenk;
            if(div != 0 && org % div == 0){
                count++;
            }
            num /= 10;
            times--;
        }
        System.out.println(count);
    }
}

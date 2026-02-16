package twopointers.slidingwindow;

public class KBeautyNumber {
    public static void main(String[] args) {
        int num = 430043;
        int k = 2;
        int org = num;
        int digits = (int) Math.log(num) + 1;
        int times = digits -k +1;
        int tenk = (int) Math.pow(num, k);
        int count = 0;
        while(times > 0){
            int div = num % tenk;
            if(div != 0 && org % div == 0){
                count++;
            }
            times--;
            num /= 10;
        }

        System.out.println(count );
    }

    public static void findKB(int num, int k){
        int org = num; // for preserving original number
        int digits = (int) Math.log10(num) + 1; // smart and fast way to find number of digits in number
        int times = digits - k + 1; // to find number of posiible sub numbers in a given number
        int count = 0;
        int tenk =(int) Math.pow(10,k); // for taking last two digits from the number
        while(times > 0){
            int div = num % tenk;
            if(div !=0 && org % div == 0){
                count++;
            }
            num /= 10;
            times--;
        }
        System.out.println(count);
    }
}


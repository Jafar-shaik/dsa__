package tricks;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 23456;
        int org = num;
        int rev = 0;
        System.out.println(num);
//        while( num != 0){
//            rev = rev * 10 + num % 10;
//            num /= 10;
//        }
//        System.out.println(org+"\n"+rev);


        int org1 = org, rev1=0;
        while (num != 0){
            rev1 = rev1 *10;
            rev1 = rev1 + num % 10;
            num /= 10;
        }
        System.out.println(rev1);

    }
}




// 23456 % 10 = 6
// 23456 / 10 = 2345
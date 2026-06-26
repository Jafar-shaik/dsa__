package practice;


public class Prac_1 {
    public static void main(String[] args) {
        String s = "jafar";
        s = "";
        System.out.println(s);
    }

    static boolean canAllocate(int[] arr, int k, int maxTime) {
        int currTime = 0, workers = 1;
        for(int xTime : arr) {
            if(xTime + currTime <= maxTime) {
                currTime += xTime;
            }
            else{
                workers++;
                currTime = xTime;

                if(workers > k) {
                    return false;
                }
            }
        }

        return true;
    }
}





/*
    low = 23, high = 106



 */
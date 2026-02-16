package practice;
import java.util.Arrays;
import java.util.Scanner;
public class SeatBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] seats = new int[10][10];
        while (true){
            System.out.println("Enter your choice \n1.Book seats\n2.Exit");
            int ch = sc.nextInt();
            switch (ch){
                case 1: System.out.println("Enter row");
                        int row = sc.nextInt();
                        System.out.println("Enter column");
                        int col = sc.nextInt();
                        bookSeats(seats,row,col);
                        break;
                case 2: System.exit(44);
            }
        }

    }
    public static void bookSeats(int seats[][], int row,int col){
        if(seats[row][col] == 0){
            System.out.println("Your seat is booked....! for the row "+row+", column "+col);
            seats[row][col] = 1;
        }else{
            int[] avl= new int[seats[0].length];
            for (int i = 0; i < seats[0].length; i++) {
                if(seats[row][i] != 0)
                    avl[i] = i;
            }
            System.out.println("Sorry seat is reserved you can book "+Arrays.toString(avl));
        }
    }
}

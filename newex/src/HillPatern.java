import java.util.Scanner;

public class HillPatern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        /*for (int row = 1; row<=x; row++) {
            int z = (2*x) - 1;
            for (int col = 1; col<=z; col++) {
                if ((row + col >= x + 1) && (row >= col - x + 1)) {
                    System.out.print("*");
                } else {
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Second");
        for (int row = 1; row<=x; row++) {
            int z = (2*x) - 1;
            for (int col = 1; col<=z; col++) {
                if ((row<=col) && (row+col<=z+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        System.out.println("Third");
        int n = (2*x) - 1;
        for (int row = 1; row<=n; row++) {
            for (int col = 1; col<=n; col++) {
                if ((row<=col) && (row+col<=n+1) && (row + col >= x + 1) && (row >= col - x + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Fourth");
        for (int row = 1; row<=n; row++) {
            for (int col = 1; col<=n; col++) {
                if ((row<=col) && (row+col<=n+1) && (row + col >= x + 1) && (row >= col - x + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

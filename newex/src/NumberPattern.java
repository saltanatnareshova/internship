import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<= x; j++) {
                if(i>=j) System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 1; i<=x; i++){
            for(int j = 1; j<= x; j++) {
                if(i<=j) System.out.print(j-i+1);
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = x; i>=1; i--){
            for(int j = x; j>= 1; j--) {
                if(i+j-2>=x) System.out.print(" ");
                else System.out.print(j);
            }
            System.out.println();
        }

        for(int i = x; i>=1; i--){
            for(int j = x; j>= 1; j--) {
                if(i>=j) System.out.print(j);
            }
            System.out.println();
        }


    }
}

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==n || i==1 || j==i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==n || i==1 || j+i==n+1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==n || i==1 || j==i || j+i==n+1 || j==1 || j==n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

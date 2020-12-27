import java.util.Scanner;

public class CheckPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}

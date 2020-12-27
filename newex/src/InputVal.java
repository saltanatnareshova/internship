import java.util.Scanner;

public class InputVal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isT = false;
        do {
            if(n>=0 && n<=10 || n>=90 && n<=100){
                isT = true;
                System.out.println("You entered "+n);
                break;
            }else{
                System.out.println("Not correct! You need to write again");
            }
            n = sc.nextInt();
        }while (!isT);
    }
}

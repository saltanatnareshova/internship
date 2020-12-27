import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inDigit;
        while (n > 0) {
            inDigit = n%10;
            System.out.println(inDigit);
            n/=10;
        }
    }
}

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inDigit;
        int sum = 0;
        while (n > 0) {
            inDigit = n%10;
            sum+=inDigit;
            n/=10;
        }
        System.out.println(sum);
    }}

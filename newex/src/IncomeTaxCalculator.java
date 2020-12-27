import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t1 = 0.1;
        double t2 = 0.2;
        double t3 = 0.3;
        double tax;
        int x = n/10000;
        int y = x*10000;
        if(n<=20000) tax = 0;
        else if(n<=40000) tax = t1*(n-20000);
        else if(n<=60000) tax = t1*20000 + t2*(n%y);
        else tax = t3*(n-60000) + t2*20000 + t1*20000;
        System.out.println(tax);
    }
}

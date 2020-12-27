import java.util.Scanner;

public class IncomeTaxSentinel {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double t1 = 0.1;
        double t2 = 0.2;
        double t3 = 0.3;
        int s = -1;
        int taxIncome;
        double tax;
        taxIncome = sc.nextInt();
        while(taxIncome!=s){
            int x = taxIncome/10000;
            int y = x*10000;
            if(taxIncome<=20000) tax = 0;
            else if(taxIncome<=40000) tax = t1*(taxIncome-20000);
            else if(taxIncome<=60000) tax = t1*20000 + t2*(taxIncome%y);
            else tax = t3*(taxIncome-60000) + t2*20000 + t1*20000;
            System.out.println(tax);
            taxIncome = sc.nextInt();
        }
        System.out.println("Bye!");
    }
}

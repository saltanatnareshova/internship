import java.util.Scanner;

public class SalesTaxCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;
        double actualPrice, salesTax;
        while (p!=SENTINEL){
            double x = p/1.07;
            double y = p-x;
            System.out.println(x);
            System.out.println(y);
            p = sc.nextDouble();
        }
    }
}

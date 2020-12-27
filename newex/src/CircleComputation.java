import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double d = 2*r;
        double s = Math.PI*r*r;
        double c = 2*Math.PI*r;
        System.out.println(d);
        System.out.println(s);
        System.out.println(c);
        double a = 4*Math.PI*r*r;
        double v = 1.33333*Math.PI*r*r*r;
        System.out.println(a);
        System.out.println(v);
    }
}

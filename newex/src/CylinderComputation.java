import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double b = Math.PI*r*r;
        System.out.println(b);
        System.out.println(2*Math.PI*r + (2*b));
        System.out.println(b*h);
    }
}

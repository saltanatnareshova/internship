import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum = n1+n2+n3;
        int p = n1*n2*n3;
        System.out.println(sum);
        System.out.println(p);
        if(n1>n2 && n1>n3) System.out.println(n1);
        else if(n2>n1 && n2>n3) System.out.println(n2);
        else if(n3>n1 && n3>n2) System.out.println(n3);
    }
}

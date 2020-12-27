import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp;
        temp = n1;
        n1=n2;
        n2=temp;
        System.out.println(n1);
        System.out.println(n2);
    }
}

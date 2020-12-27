import java.util.Scanner;

public class TriangleTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(c<a+b && a<c+b && b<c+a){
            System.out.println("It is a triangle");
        }else{
            System.out.println("It is not a triangle");
        }
    }
}

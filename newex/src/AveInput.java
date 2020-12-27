import java.util.Scanner;

public class AveInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 3;
        int n;
        boolean isValid;
        int sum = 0;
        for(int i =0; i<num; i++){
            n = sc.nextInt();
            isValid = false;
            do{
                if(n>=0 && n<=100) {
                    isValid = true;
                    System.out.println("The score of " + i + " equals to " + n);
                    sum+=n;
                }else {
                    System.out.println("Incorrect");
                    i--;
                    break;
                }
            }while (!isValid);

        }
        System.out.println(sum/3);
    }
}

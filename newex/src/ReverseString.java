import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] r = s.toCharArray();
        int l = s.length();
        for(int i = l-1; i>=0; i--){
            System.out.print(r[i]);
        }
    }

}

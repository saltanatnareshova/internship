import java.util.Scanner;

public class DecodeCezar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int x = 3;
        StringBuilder sb=new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(c[i]>=68 && c[i]<=90){
                int t = c[i] - 'A' - x;
                sb.append((char)(t +'A'));
            }
            if (c[i] == 'A') sb.append('X');
            if (c[i] == 'B') sb.append('Y');
            if (c[i] == 'C') sb.append('Z');

        }
        System.out.println(sb);
    }
}

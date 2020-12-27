import java.util.Scanner;

public class CodeCezar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int x = 3;
        StringBuilder sb=new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(c[i]>=65 && c[i]<=87) {
                int t = c[i] - 'A' + x;
                sb.append((char) (t + 'A'));
            }
            if (c[i] == 'X') sb.append('A');
            if (c[i] == 'Y') sb.append('B');
            if (c[i] == 'Z') sb.append('C');
        }
        System.out.println(sb);
    }
}

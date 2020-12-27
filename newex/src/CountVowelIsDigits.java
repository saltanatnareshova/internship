import java.util.Scanner;

public class CountVowelIsDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        char[] r = s.toCharArray();
        int cd = 0;
        int cc = 0;
        for(int i = 0; i<s.length(); i++){
            if(r[i] >= '0' && r[i]<='9') cd++;
            else if(r[i]=='a' || r[i]=='e' || r[i]=='i' || r[i]=='o' || r[i]=='u') cc++;
        }
        System.out.println(cd);
        System.out.println((double)(cd/s.length())*100);
        System.out.println(cc);
        System.out.println((double)(cc/s.length())*100);
    }
}

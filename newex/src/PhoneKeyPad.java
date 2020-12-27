import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.next().toLowerCase();
        char[] c = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(c[i]=='a' || c[i]=='b' || c[i]=='c') System.out.println(2);
            else if(c[i]=='d' || c[i]=='e' || c[i]=='f') System.out.println(3);
            else if(c[i]=='g' || c[i]=='h' || c[i]=='i') System.out.println(4);
            else if(c[i]=='j' || c[i]=='k' || c[i]=='l') System.out.println(5);
            else if(c[i]=='m' || c[i]=='n' || c[i]=='o') System.out.println(6);
            else if(c[i]=='p' || c[i]=='q' || c[i]=='r' || c[i]=='s') System.out.println(7);
            else if(c[i]=='t' || c[i]=='u' || c[i]=='v') System.out.println(8);
            else if(c[i]=='w' || c[i]=='x' || c[i]=='y' || c[i]=='z') System.out.println(9);

            switch (c[i]) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println(2);
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.println(3);
                break;
            case 'g':
            case 'h':
            case 'i':
                System.out.println(4);
                break;
            case 'j':
            case 'k':
            case 'l':
                System.out.println(5);
                break;
            case 'm':
            case 'n':
            case 'o':
                System.out.println(6);
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                System.out.println(7);
                break;
            case 't':
            case 'u':
            case 'v':
                System.out.println(8);
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println(9);
                break;
            }
        }
    }
}

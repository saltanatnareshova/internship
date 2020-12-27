import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args){
        Scanner sc= new Scanner((System.in));
        String s = sc.next().toUpperCase();
        char[] c = s.toCharArray();
        for(int i = 0; i< s.length(); i++){
            if(c[i]=='A') System.out.print("Z");
            else if(c[i]=='B') System.out.print("Y");
            else if(c[i]=='C') System.out.print("X");
            else if(c[i]=='D') System.out.print("W");
            else if(c[i]=='E') System.out.print("V");
            else if(c[i]=='F') System.out.print("U");
            else if(c[i]=='G') System.out.print("T");
            else if(c[i]=='H') System.out.print("S");
            else if(c[i]=='I') System.out.print("R");
            else if(c[i]=='J') System.out.print("Q");
            else if(c[i]=='K') System.out.print("P");
            else if(c[i]=='L') System.out.print("O");
            else if(c[i]=='M') System.out.print("N");
            else if(c[i]=='N') System.out.print("M");
            else if(c[i]=='O') System.out.print("L");
            else if(c[i]=='P') System.out.print("K");
            else if(c[i]=='Q') System.out.print("J");
            else if(c[i]=='R') System.out.print("I");
            else if(c[i]=='S') System.out.print("H");
            else if(c[i]=='T') System.out.print("G");
            else if(c[i]=='U') System.out.print("F");
            else if(c[i]=='V') System.out.print("E");
            else if(c[i]=='W') System.out.print("D");
            else if(c[i]=='X') System.out.print("C");
            else if(c[i]=='Y') System.out.print("B");
            else if(c[i]=='Z') System.out.print("A");
        }
    }
}

public class CozaLozaWoza {
    public static void main(String[] args){
        int l = 1;
        int h = 110;
        for( int i = l; i<= h; i++){
            if(i%3==0) System.out.println("Coza");
            else if(i%5==0) System.out.println("Loza");
            else if(i%7==0) System.out.println("Woza");
            if(i%3==0 && i%5==0) System.out.println("CozaLoza");
            else if(i%3==0 && i%7==0) System.out.println("CozaWoza");
            else if(i%5==0 && i%7==0) System.out.println("Lozawoza");
            System.out.println(i);
            if(i%11==0) System.out.println("\n");
            else System.out.println(" ");
        }
    }
}

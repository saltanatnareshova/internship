public class PrintNumberInWord {
    public static void main(String[] args){
        int n = 5;
        if(n==1) System.out.println("ONE");
        else if(n==2) System.out.println("TWO");
        else if(n==3) System.out.println("THREE");
        else if(n==4) System.out.println("FOUR");
        else if(n==5) System.out.println("FIVE");
        else if(n==6) System.out.println("SIX");
        else if(n==7) System.out.println("SEVEN");
        else if(n==8) System.out.println("EIGHT");
        else if(n==9) System.out.println("NINE");
        else System.out.println("OTHER");
        switch (n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
        }
    }
}

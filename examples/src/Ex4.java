public class Ex4 {
    public static void main(String[] args){
        int test = 50;
        if(test==50) System.out.println(test);
        if(test>=95) System.out.println("Best");
        else if(test>50) System.out.println("Good");
        else System.out.println("Bad");

        int myNumber = 5;
        switch (myNumber){
            case 1: System.out.println("Gold");
                    break;
            case 2: System.out.println("Silver");
                    break;
            case 3: System.out.println("Bronze");
                break;
            case 4: System.out.println("Gramota");
                break;
            default: System.out.println("unknown");

        }

        String day = "Monday";
         switch (day){
             case "Monday": System.out.println("Yeees");
                            break;
             case "Wednesday": System.out.println("Nooo");
                                break;
             default: System.out.println("unknown");
         }
    }
}

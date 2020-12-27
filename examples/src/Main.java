public class Main {
    public static void main(String[] args){

        byte myByte = 122;
        short myShort = 200;
        int myInt = myByte + myShort;
        long myLong = 13435464532546L;

        float myFloat = 12.2313F;
        double myDouble = 23.343434;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        float Result = (float)(myByte + myShort + myInt + myLong + myDouble + myFloat);
        System.out.println(Result);

        char char1 = 'C';
        char char2 = 'a';
        char char3 = 'l';
        char char4 = '?';
        char char5 = 'W';

        System.out.println(char1);
        System.out.println("text " +char1 + char2 + char3 + char4 + char5);

        boolean b1 = false;
        boolean b2 = true;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        if(b2){
            System.out.println(b1);
        }

    }
}


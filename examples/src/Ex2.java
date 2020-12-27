public class Ex2 {
    public static void main(String[] args){
        byte myByte = 124;
        short myShort = myByte;
        int myInt = myShort + 32767;

        System.out.println(myShort);
        System.out.println(myInt);

        myShort = (short) (myInt);

        System.out.println(myShort);

        long myLong = 1234567891122121234L;
        double longToDouble = myLong;
        long myLong2 = (long) (longToDouble);

        System.out.println(myLong);
        System.out.println(longToDouble);
        System.out.println(myLong2);
    }
}

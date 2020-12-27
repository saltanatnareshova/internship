public class Fibonacci {
    public static void main (String [] args) {
        int n = 3;
        int fn = 0;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        int nMax = 20;
        int sum = 0;
        int s = fnMinus1 + fnMinus2;
        System.out.println ("Первые" + nMax + "числа Фибоначчи:");
        System.out.println(fnMinus1);
        System.out.println(fnMinus2);
        while (n <= nMax) {
            fn = fnMinus1+fnMinus2;
            s+=fn;
            System.out.println(fn);
            ++ n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        double a = (double)s/nMax;
        System.out.println(a);

    }
}

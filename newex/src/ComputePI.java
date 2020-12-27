public class ComputePI {
    public static void main(String[] args){
        double sum = 0.0;
        int maxDenominator = 10000; //increasing the value increases the accuracy
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {

            if (denominator % 4 == 1) {
                sum +=(double)1/denominator;
            } else if (denominator % 4 == 3) {
                sum -=(double)1/denominator;
            } else {
                System.out.println("«Невозможно !!!»");
            }
        }
        System.out.println(sum*4);
        int maxTerm = 10000;
        double s= 0;
        for(int t = 1; t <= maxTerm; t ++) {
            if(t%2==1) s+=(double)1/(t*2-1);
            else if(t%2==0) s-=(double)1/(t*2-1);
        }
        System.out.println(s*4);
        double p = (s/Math.PI)*100;
        System.out.println(p);
        }

}

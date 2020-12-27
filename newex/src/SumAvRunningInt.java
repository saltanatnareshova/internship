public class SumAvRunningInt {
    public static void main(String[] args){
        int s = 0;
        double a = 0;
        int l = 1;
        int h = 100;
        int c = 0;
        //for
        for(int i = l; i<=h; i++){
            s +=i;
            c++;
        }
        int k;
        k = l;
       //while
        while(k<=h){
            s+=k;
            c++;
            k++;
        }
        //do-while
        do{
            s+=k;
            c++;
            k++;
        }while (k<=h);
        a = (double)s/c;

        System.out.println(s);
        System.out.println(a);
        //sum of squares
        for(int j = l; j<=h; j++){
            int q = j*j;
            s+=q;
        }
        System.out.println(s);
        //oddeven
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff = 0;
        for(int z = 0; z<=h; z++){
            if(z%2==0) sumEven+=z;
            else if(z%2!=0) sumOdd+=z;
        }
        System.out.println(sumEven + " " + sumOdd);
        if(sumEven>=sumOdd) {
            absDiff = sumEven - sumOdd;
        }else if(sumEven<=sumOdd) absDiff = sumOdd-sumEven;
        System.out.println(absDiff);

    }
}


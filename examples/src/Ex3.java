public class Ex3 {
    public static void main(String[] args){
        int x = 10;
        int y = 3;
        int sum = x+y;
        int d = x-y;
        int t = x/y;
        int p = x*y;
        int r = x%y;

        System.out.println(sum);
        System.out.println(d);
        System.out.println(t);
        System.out.println(p);
        System.out.println(r);

        double m = 7;
        double n = 7;

        double res1 = 2*n++;
        double res2 = 2*++m;

        System.out.println(res1);
        System.out.println(res2);

        int a = 0;
        a+=50;
        System.out.println(a);
        a-=5;
        System.out.println(a);
        a/=5;
        System.out.println(a);
        a*=5;
        System.out.println(a);

        int c = 30;
        int v = 20;
        int b = 10;
        boolean check1 = c==v;
        System.out.println(check1);
        boolean check2 = c<=v;
        System.out.println(check2);
        boolean check3 = v>b;
        System.out.println(check3);
        boolean check4 = c!=b;
        System.out.println(check4);
        boolean check6 = check2 && check3;
        boolean check7 = check1 && check2;
        System.out.println(check6);
        System.out.println(check7);
        boolean check8 = check1 || check2;
        boolean check9 = check3 || check2;
        System.out.println(check8);
        System.out.println(check9);

        int result = c>v? c:v;
        System.out.println(result);
        int result2 =(v>c) && (v>b)? v:b;
        System.out.println(result2);
    }

}


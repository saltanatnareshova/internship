public class HarmonicSum {
    public static void main(String[] args){
        int maxD = 5000;
        double lr = 0;
        double rl = 0;
        double absD = 0;
        for(int i = 1; i<=maxD; i++){
            lr += (double)1/i;
        }
        System.out.println("LeftRight "+lr);
        for(int j = 1; j<=maxD; j++){
            rl += (double)1/j;
        }
        System.out.println("RightLeft "+rl);
        if(lr>=rl) absD = lr-rl;
        else if(rl>=lr) absD = rl-lr;
        System.out.println(absD);
    }
}

import java.util.Scanner;

public class PensionCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int age = sc.nextInt();
        final double r1 = 0.2;
        final double r2 = 0.17;
        final double r3 = 0.13;
        final double r4 = 0.13;
        final double r5 = 0.075;
        final double r6 = 0.09;
        final double r7 = 0.05;
        final double r8 = 0.075;
        int cs;
        double employeeContribution, employerContribution, totalContribution;
        int contract = 6000;
        if(age<=55){
            employeeContribution=salary*0.2;
            employerContribution=salary*0.17;
        }else if(age<=60){
            employeeContribution=salary*0.13;
            employerContribution=salary*0.13;
        }else if(age<=65){
            employeeContribution=salary*0.075;
            employerContribution=salary*0.09;
        }else{
            employeeContribution=salary*0.05;
            employerContribution=salary*0.075;
        }
        totalContribution=employeeContribution+employerContribution;
        System.out.println(employeeContribution);
        System.out.println(employerContribution);
        System.out.println(totalContribution);
    }
}

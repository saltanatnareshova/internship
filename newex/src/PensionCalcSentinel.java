import java.util.Scanner;

public class PensionCalcSentinel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int sentinel = -1;
        double employeeContribution, employerContribution, totalContribution;
        while (salary!= sentinel){
            int age = sc.nextInt();
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

            salary = sc.nextInt();
        }
    }
}

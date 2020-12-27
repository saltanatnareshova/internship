package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int returnInt(){
        System.out.println("Enter the number: ");
        int x;
        if(sc.hasNextInt()){
            x = sc.nextInt();
        }else{
            System.out.println("Not correct input, please try again!");
            sc.next();
            x = returnInt();
        }
        return x;
    }
    public static char getOperation() {
        System.out.println("Enter the operation: ");
        char a;
        if (sc.hasNext()) {
            a = sc.next().charAt(0);
        } else {
            System.out.println("Not correct operation entered!");
            sc.next();
            a = getOperation();
        }
        return a;
    }
    public static double result(int n1,int n2,char o){
        double res;
        switch (o){
            case '+': res=n1+n2;
                break;
            case '-': res=n1-n2;
                break;
            case '/': res=(double)n1/n2;
                break;
            case '*': res=n1*n2;
                break;
            default: System.out.println("The operation is not correct, try again");
                res = result(n1,n2,getOperation());
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Author: Naresova Saltanat");
	    while(true){
            int n1 = returnInt();
            int n2 = returnInt();
            char operation = getOperation();
            double res = result(n1, n2, operation);
            System.out.println("The result is: "+ res);
            System.out.println("Continue? 1-Yes 0 - No");
            int y = sc.nextInt();
            if(y==0) break;
        }
    }
}

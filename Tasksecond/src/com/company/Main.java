package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int n = scanner.nextInt();
        int[] arr = new int[n];*/
        //int sum = 0;
        double av = 0;
        /*for (int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
            av = sum/n;
        }
        System.out.println(sum + " " + av);*/
        while(scanner.nextInt() > 0){
          int sum = sum + scanner.nextInt();
        }
        System.out.println(sum);

    }
}

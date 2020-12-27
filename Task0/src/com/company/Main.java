package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            double c = a;
            for (int i = 0; i < n; i++) {
                double x = Math.pow(2, i);
                c = c + x * b;
                System.out.println(c);
            }
        }
    }
}

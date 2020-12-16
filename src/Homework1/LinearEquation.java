package Homework1;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double x = 0;
        try {
            x = (-b/a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("x= " + x);
    }
}
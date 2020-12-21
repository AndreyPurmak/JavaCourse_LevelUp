package Homework2;

import java.util.Scanner;

public class Task2 {

    /* Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 10;
        System.out.println("Введите число m");
        double m = scanner.nextDouble();
        if (m > 0) {
            System.out.println("Введите число n");
        } else {
            System.out.println("Число m отрицательное или равно нулю");
            scanner.close();
        }

        double n = scanner.nextDouble();
        if (n <= 0) {
            System.out.println("Число n отрицательное или равно нулю");
            scanner.close();
        }
        double deltaOne = Math.abs(x - m);
        double deltaTwo = Math.abs(x - n);
        if (deltaOne > deltaTwo) {
            System.out.println(n + " - ближайшее к 10 число");
        } else {
            System.out.println(m + " - ближайшее к 10 число");
        }
    }
}
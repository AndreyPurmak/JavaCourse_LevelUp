package Homework2;

import java.util.Scanner;

public class Task10 {

    /* Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int factorial = 1;
        do {
            System.out.println("Введите натуральное число n");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Введено ненатуральное число.");
                scanner.close();
            } else {
                for (int i = 1; i <= n; i++)
                    factorial *= i;
                System.out.println(factorial);
            }
        } while (n <= 0);
    }
}
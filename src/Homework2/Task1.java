package Homework2;

import java.util.Scanner;

public class Task1 {

    /* Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " - четное число");
        } else {
            System.out.println(x + " - нечетное число");
        }
    }
}
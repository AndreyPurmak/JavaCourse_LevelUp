package Homework2;

import java.util.Random;

public class Task4 {

    /* Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. */
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(899) + 100;
        int a = x % 10;
        int b = (x/10) % 10;
        int c = (x/100) % 10;
        System.out.println("Рандомное число: " + x);
        if (a >= b & b > c || a > b & a >= c ) {
            System.out.println("Наибольшая цифра в рандомном числе: " + a);
        } else {
            if (b > a & b > c) {
                System.out.println("Наибольшая цифра в рандомном числе: " + b);
            } else {
                System.out.println("Наибольшая цифра в рандомном числе: " + c);
            }
        }
    }
}
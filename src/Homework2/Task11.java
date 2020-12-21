package Homework2;

import java.util.Scanner;

public class Task11 {

    /* Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры. */
    public static void main(String args[]) {
        int n;
        int count = 0;
        System.out.println("Введите натуральное число");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Вы ввели ненатуральное число");
            scanner.close();
        }
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.println("Число делится на: " + i);
                System.out.println("Количество делителей - " + count);
            }
        }
    }
}
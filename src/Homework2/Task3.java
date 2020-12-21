package Homework2;

import java.util.Random;

public class Task3 {

    /* Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран. */
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(150 + 1) + 5;
        if(a <= 25 || a >= 100){
            System.out.println(a + " не содержится в интервале (25,100)");
        }
        else {
            System.out.println(a +  " содержится в интервале (25,100)");
        }
    }
}
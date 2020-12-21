package Homework2;

import java.util.Scanner;

public class Task5 {

    /*
    * В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
    * Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("a, b и c: " + a + " " + b + " " + c);
        if(a < b & a < c){
            if(b < c)System.out.println("Возрастающая последовательность " + a + " " + b + " " + c);
            else System.out.println("Возрастающая последовательность " + a + " " + c + " " + b);
        }
        if(b < a & b < c){
            if(a < c)System.out.println("Возрастающая последовательность " + b + " " + a + " " + c);
            else System.out.println("Возрастающая последовательность " + b + " " + c + " " + a);
        }
        if(c < a & c < b){
            if(a < b)System.out.println("Возрастающая последовательность " + c + " " + a + " " + b);
            else System.out.println("Возрастающая последовательность " + c + " " + b + " " + a);
        }
    }
}
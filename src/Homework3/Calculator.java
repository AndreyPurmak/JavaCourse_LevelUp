package Homework3;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Addition int: " + add(8,10));
        System.out.println("Addition double: " + add(8.3, 10.2));
        System.out.println("Addition long: " + add(5L, 8L));
        System.out.println("Subtraction int: " + subtract(10, 2));
        System.out.println("Subtraction double: " + subtract(15.2, 12.1));
        System.out.println("Subtraction long: " + subtract(25L, 18L));
        System.out.println("Multiplication int: " + multiply(3,3));
        System.out.println("Multiplication double: " + multiply(1.0,3.3));
        System.out.println("Multiplication long: " + multiply(5L, 10L));
        System.out.println("Division int: " + divide(125, 5));
        System.out.println("Division double: " + divide(9.0, 3.0));
        System.out.println("Division long: " + divide(96L, 4L));
    }
    public static int add (int a, int b) {
        return a + b;
    }
    public static double add (double a, double b) {
        return a + b;
    }
    public static long add (long a, long b) {
        return a + b;
    }
    public static int subtract (int a, int b) {
        return a - b;
    }
    public static double subtract (double a, double b) {
        return Math.round((a - b)*100.0)/100.0;
    }
    public static long subtract (long a, long b) {
        return a - b;
    }
    public static int multiply (int a, int b) {
        return a * b;
    }
    public static double multiply (double a, double b) {
        return a * b;
    }
    public static long multiply (long a, long b) {
        return a * b;
    }
    public static int divide (int a, int b) {
        return a / b;
    }
    public static double divide (double a, double b) {
        return a / b;
    }
    public static long divide (long a, long b) {
        return a / b;
    }
}
package Homework2;

public class Task8 {

    /* Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 … */
    public static void main(String[] args) {
        for(int a = 90; a > 0; a -= 5){
            System.out.print(a + System.lineSeparator());
        }
    }
}
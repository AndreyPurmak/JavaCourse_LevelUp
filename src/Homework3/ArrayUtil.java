package Homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        System.out.println(min(array));
        System.out.println("==================");
        System.out.println(max(array));
    }

    static int[] array = new int[] {89, 52, 68, 47, 95, -89};

    static int min (int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++)
            if (minValue > array[i])
                minValue = array[i];
        return minValue;
    }

    static int max (int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++)
            if (maxValue < array[i])
                maxValue = array[i];
        return maxValue;
    }
}
package Homework3;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = new int[] {1, 0, -5, -6, -5, 5, 2};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void bubbleSort(int[] array) {
        int sortedArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j-1] > array[j]) {
                    sortedArray = array[j-1];
                    array[j-1] = array[j];
                    array[j] = sortedArray;
                }
            }
        }
    }
}
package Homework_3;

// 2)Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"яблоко", "банан", "апельсин", "груша"};

        System.out.println("Исходный массив:");
        printArray(array);

        reverseArray(array);

        System.out.println("Массив после обращения:");
        printArray(array);
    }

    public static void reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

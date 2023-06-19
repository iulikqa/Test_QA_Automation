package Homework_3;

import org.jetbrains.annotations.NotNull;

//4)Написать мкетод который будет выводить четные числа и написать метоод котрый будет выводить не четные числа
public class EvedOddNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа:");
        printEvenNumbers(array);

        System.out.println("Нечетные числа:");
        printOddNumbers(array);
    }

    public static void printEvenNumbers(int @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void printOddNumbers(int @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}

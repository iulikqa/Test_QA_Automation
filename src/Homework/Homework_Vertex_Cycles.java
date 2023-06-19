package Homework;

import java.util.Scanner;

public class Homework_Vertex_Cycles {
    public static void main(String[] args) {
        //Задача №1
        //Необходимо вывести на экран числа от 1 до 5. На экране должно быть: 1 2 3 4 5

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        //Задача №2
        //Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        //Задача №3
        //Необходимо вывести на экран таблицу умножения на 3:
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);
        }

    }

}

//Задача №4
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
class Test {

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
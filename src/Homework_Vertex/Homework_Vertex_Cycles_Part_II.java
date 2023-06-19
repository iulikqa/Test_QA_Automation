package Homework_Vertex;

public class Homework_Vertex_Cycles_Part_II {
    public static void main(String[] args) {
        //Задача №1
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        int a = 7;
        while (a <= 98) {
            System.out.println(a + " ");
            a += 7;
        }

        //Задача №2
        // Необходимо вывести на консоль такую последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        int b = 1;
        while (b <= 512) {
            System.out.print(b + " ");
            b *= 2;
        }
    }
}

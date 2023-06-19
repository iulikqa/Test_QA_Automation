package Homework_3;

//3)Посчитайте среднее арифметическое элементов массива
public class AverageArray {
    public static void main(String[] args) {
        int[] array = {7, 80, 33, 15, 57};

        double average = calculateAverage(array);

        System.out.println("Среднее арифметическое: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }
}

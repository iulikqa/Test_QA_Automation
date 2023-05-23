package Homework;

public class Homework_JAVA_Lesson_2 {
    public static void main(String[] args) {
        int[] company = {9, 12, 5, 44, 3};
        //Посчитать сколько элементов имеет масив сompany(что б не с 0 считал а с 1)
        int g = 0;
        for (int i = 1; i < company.length; i++) {
            g++;
        }
        System.out.println("count elements" + " " + g);

        //Вывести последний, первый и второй элемент
        int lastIndex = company.length - 1;
        int firstElement = company[0];
        int secondElement = company[1];
        System.out.println("Last element" + " " + company[lastIndex]);
        System.out.println("First element" + " " + firstElement);
        System.out.println("Second element" + " " + secondElement);

        //Вывести размер масива
        System.out.println("Size" + " " + company.length);
    }
}


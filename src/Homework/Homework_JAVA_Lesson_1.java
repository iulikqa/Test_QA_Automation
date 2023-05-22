package Homework;

public class Homework_JAVA_Lesson_1 {
    /*b1.Есть стринг I love java**/
    public static void main(String[] args) {
        String emotion = "I love JAVA";

        /*а)Посчитать сколько букв в этой фразе**/
        System.out.println(emotion.length());

        /*б)Вывести букву под индексом 4**/
        char c = emotion.charAt(4);
        System.out.println(c);

        /*в)Вывсти индекс буквы j**/
        System.out.println(emotion.indexOf("j"));

        /*Добавть в эту фразу and QA Automation (должно вывексти I love java and QA Automation)**/
        System.out.println(emotion.concat(" and QA Automation"));

        /*2)Проверить через boolean что фраза I love java типа String**/
        boolean isString = emotion instanceof String;
        System.out.println(isString);
    }
}


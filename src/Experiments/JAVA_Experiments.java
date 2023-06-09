package Experiments;

/*Объявление нового класса,
который содержит код программы*/
public class JAVA_Experiments { // начало объявления класса JAVA_Experiments

    // определение метода main
    public static void main(String[] args) {    // объявление нового метода

        System.out.println("Hello Java!");     // вывод строки на консоль
        // конец объявления нового метода

        int x;      // объявление переменной
        x = 10;// присвоение значения
        System.out.println(x);  // результат в консоли 10

        // Также можно присвоить значение переменной при ее объявлении. Этот процесс называется инициализацией:
        int y = 15;     // объявление и инициализация переменной
        System.out.println(y);  // результат в консоли 15

        //Через запятую можно объявить сразу несколько переменных одного типа:
        int n, m;
        n = 18;
        m = 27;
        System.out.println(n);  // результат в консоли 18
        System.out.println(m);  // результат в консоли 27

        //Также можно их сразу инициализировать:
        int r = 8, s = 19;
        System.out.println(r);  // результат в консоли 8
        System.out.println(s);  // результат в консоли 19

        //Отличительной особенностью переменных является то, что мы можем в процессе работы программы изменять их значение:
        int v = 34;
        System.out.println(v);  // результат в консоли 34
        v = 45;
        System.out.println(v);  // результат в консоли 45

        /*Начиная с Java 10 в язык было добавлено ключевое слово var, которое также позволяет определять переменную и
        ставится вместо типа данных, а сам тип переменной выводится из того значения, которое ей присваивается.
        Например, переменной k присваивается число 55, значит, переменная будет представлять тип int.
        Но если переменная объявляется с помощью var, то мы обязательно должны инициализировать ее,
        то есть предоставить ей начальное значение*/
        var k = 55;
        System.out.println(k);  // результат в консоли 55

        /*Кроме переменных, в Java для хранения данных можно использовать константы. В отличие от переменных
        константам можно присвоить значение только один раз. Константа объявляется также,
        как и переменная, только вначале идет ключевое слово final*/

        final int LIMIT = 5;
        System.out.println(LIMIT);  // результат в консоли 5

        // LIMIT=57; >> так мы уже не можем написать, так как LIMIT - константа

        /*Как правило, константы имеют имена в верхнем регистре. Константы позволяют задать такие переменные,
        которые не должны больше изменяться. Например, если у нас есть переменная для хранения числа pi,
        то мы можем объявить ее константой, так как ее значение постоянно.*/


    }
} // конец объявления класса JAVA_Experiments


package Course;

import java.util.Scanner;

public class Losson_3_Course {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();
    }
}
//public class Lesson_3_Course {

//        for (int i = 0; i < 5; i++) {
//            System.out.println("I" + " " + i);
//        }
//
//        for (int j = 0; j < 10; j = j + 2) {
//            System.out.println("J" + " " + j);
//        }

//        for (int j = 0; j < 18; j = j + 6) {
//            if (j == 9) {
//                break;
//            }
//            System.out.println("J" + " " + j);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                continue;
//            }
//            System.out.println("I" + " " + i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 4 || i == 7) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        masivul se foloseste cint avem o multime de date
//        int[] Test = {1, 5, 8, 11, 1088};
//        double[] test_decimal = {1.5, 2.9, 8, 6};

//        String[] credit = {"Test", "Prima Casa", "Test 1"};

//        String credit_maib[] = new String[2];
//        credit_maib[0] = "Credit1";
//        credit_maib[1] = "Credit2";
//        System.out.println("Credit1");

//        int[] anithing = {1, 8, 6, 7, 9, 2};
//        for (int i = 0; i < anithing.length; i++) {
//            System.out.println("All elements" + " " + anithing[i]);
//        }
//        System.out.println("Index 3" + " " + anithing[3]);

//string array - prescurtat
//        String[] company = {"MAIB", "Allied Tessting", "EST Computer", "Endava"};
//        for (String i : company) {
//            System.out.println(i);
//        }

// ciclu for obisnuit - care ne intoarce doar indexul elementelor din masiv
//        for (int i = 0; i < company.length; i++) {
//            System.out.println(i);
//        }
//        System.out.println(company[2]);
//
//        for (int i = 0; i < 2; i++) {
//            System.out.println(company[i]);
//        }

// schimbarea variabilei in masiv
//        int[][] nr = {{1, 2, 3, 4}, {5, 6, 7}};
//        System.out.println(nr[1][2]);
//        //Change values
//        nr[1][2] = 4;
//        System.out.println(nr[1][2]);
//        for (int i = 0; i < nr.length; i++) {
//            for (int j = 0; j < nr[i].length; j++) {
//                System.out.println(nr[i][j]);
//            }
//        }


//        int[] nr = {1, 2, 3, 4, 5, 6, 7, 8};
//        for (int i = 0; i < nr.length; i++) {
//            if (nr[i] == 7) {
//                System.out.println(i);
//            } else {
//                System.out.println("Not found");
//            }
////        }
//        //домашка:
//        //бинырный поиск, линейный поиск, сортировка методом пузырька, вывести минимальное и потом максимальное число из масива
//
//            }
//        }





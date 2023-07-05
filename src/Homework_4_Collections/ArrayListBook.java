package Homework_4_Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


//Cоздать коллекцию Book (id,название ,автор, год издания ,количество страниц ,цена)
public class ArrayListBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "War and Peace", "Leo Tolstoy", 1869, 1225, "Russian Publisher", 15));
        books.add(new Book(2, "Anna Karenina", "Leo Tolstoy", 1877, 864, "The Russian Messenger", 12));
        books.add(new Book(3, "Resurrection", "Leo Tolstoy", 1899, 512, "Thomas Y Crowell & Co", 10));
        books.add(new Book(4, "1984", "George Orwell", 1949, 328, "Secker & Warburg", 10));
        books.add(new Book(5, "Animal Farm", "George Orwell", 1945, 144, "Secker and Warburg", 8));
        books.add(new Book(6, "Burmese Days", "George Orwell", 1934, 300, "Harper & Brothers", 12));
        books.add(new Book(7, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, 223, "Scholastic Press", 12));
        books.add(new Book(8, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998, 251, "Scholastic Press", 11));
        books.add(new Book(9, "Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999, 317, "Scholastic Press", 13));
        books.add(new Book(10, "Crime and Punishment", "Fyodor Dostoevsky", 1866, 551, "The Russian Messenger", 8));

//      a) Вывести список книг заданого автора

        books.sort(Comparator.comparing(Book::getTitle));
        System.out.println(books);
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = sc.nextLine();
        for (Book book : books) {
            if (book.getAuthor().equals(name)) {
                System.out.println(book);
            }
        }
//        b) Вывести список книг выпущенных заданным издательством
        System.out.println("Input publisher: ");
        String publisher = sc.nextLine();
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
            }
        }
//        c) Вывести списoк книг выпущенных после заданного года
        System.out.println("Input year: ");
        int year = sc.nextInt();
        for (Book book : books) {
            if (book.year > year) {
                System.out.println(book);
            }
        }
    }
}



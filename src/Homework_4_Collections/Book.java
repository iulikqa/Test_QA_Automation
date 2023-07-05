package Homework_4_Collections;

public class Book {
    int id;
    String title;
    String author;
    int year;
    int pageCount;
    String publisher;
    int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(int id, String title, String author, int year, int pageCount, String publisher, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
        this.publisher = publisher;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id ='" + id + '\'' +
                ", title ='" + title + '\'' +
                ", author=" + author +
                ", year ='" + year + '\'' +
                ", pageCount=" + pageCount +
                ", publisher ='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }

}

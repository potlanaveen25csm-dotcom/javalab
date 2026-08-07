
class Book {

    private int bookId;
    private String bookName;
    private String author;
    private double price;

    int getBookId() {
        return bookId;
    }

    void setBookId(int bookId) {
        this.bookId = bookId;
    }

    String getBookName() {
        return bookName;
    }

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    Book() {
        bookId = 0;
        bookName = "";
        author = "";
        price = 0.0;
    }

    Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book ID: " + getBookId());
        System.out.println("Book Name: " + getBookName());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}

public class ConstructorEncapsulation {

    public static void main(String[] args) {

        Book b1 = new Book();

        b1.setBookId(101);
        b1.setBookName("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(450.50);

        b1.display();

        System.out.println();

        Book b2 = new Book(102, "Python Programming", "Guido van Rossum", 500.00);

        b2.display();
    }
}


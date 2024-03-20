package Prototype;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter");
        Book clonedBook = (Book) book.doClone();
    }
}

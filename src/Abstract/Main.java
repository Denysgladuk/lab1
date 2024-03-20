package Abstract;

public class Main {
    public static void main(String[] args) {
        BookFactory fictionFactory = new FictionBookFactory();
        Book fictionBook = fictionFactory.createBook("The Great Gatsby");

        BookFactory nonFictionFactory = new NonFictionBookFactory();
        Book nonFictionBook = nonFictionFactory.createBook("Sapiens: A Brief History of Humankind");

        System.out.println("Book 1 Title: " + fictionBook.getTitle());
        System.out.println("Book 2 Title: " + nonFictionBook.getTitle());
    }
}
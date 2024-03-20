package One;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("Sapiens: A Brief History of Humankind");
        library.addBook("Fiction", book1);
        library.addBook("Non-Fiction", book2);

        library.displayBooks();

        Book retrievedBook = library.getBook("Fiction");
        if (retrievedBook != null) {
            System.out.println("Retrieved Book: " + retrievedBook.getTitle());
        }
    }
}

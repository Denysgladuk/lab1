package One;
import java.util.HashMap;
import java.util.Map;
class Library {
    private static Library instance;
    private Map<String, Book> books;
    private Library() {
        books = new HashMap<>();
    }
    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }
    public void addBook(String title, Book book) {
        books.put(title, book);
    }
    public Book getBook(String title) {
        return books.get(title);
    }
    public void displayBooks() {
        System.out.println("Books in Library:");
        for (String title : books.keySet()) {
            System.out.println("- " + title);
        }
    }
}
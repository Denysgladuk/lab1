package Factory;

abstract class Library {
    public abstract Book createBook(String title);

    public void displayBookInfo(String title) {
        Book book = createBook(title);
        System.out.println("Fabric.Book Title: " + book.getTitle());
    }
}
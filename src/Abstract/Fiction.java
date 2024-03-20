package Abstract;

class FictionBookFactory implements BookFactory {
    @Override
    public Book createBook(String title) {
        return new FictionBook(title);
    }
}
class NonFictionBookFactory implements BookFactory {
    @Override
    public Book createBook(String title) {
        return new NonFictionBook(title);
    }
}
class FictionBook extends Book {
    public FictionBook(String title) {
        super("Fiction: " + title);
    }
}
class NonFictionBook extends Book {
    public NonFictionBook(String title) {
        super("Non-Fiction: " + title);
    }
}
package Factory;

class FictionLibrary extends Library {
    @Override
    public FictionBook createBook(String title) {
        return new FictionBook(title);
    }
}

class NonFictionLibrary extends Library {
    @Override
    public NonFictionBook createBook(String title) {
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
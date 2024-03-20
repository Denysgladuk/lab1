package Factory;

public class Main {
    public static void main(String[] args) {
        Library fictionLibrary = new FictionLibrary();
        fictionLibrary.displayBookInfo("The Great Gatsby");

        Library nonFictionLibrary = new NonFictionLibrary();
        nonFictionLibrary.displayBookInfo("Sapiens: A Brief History of Humankind");
    }
}
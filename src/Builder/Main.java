package Builder;
public class Main {
    public static void main(String[] args) {
        LibrarySectionBuilder builder = new ConcreteLibrarySectionBuilder();
        LibrarySectionDirector director = new LibrarySectionDirector();

        LibrarySection fantasySection = director.construct(builder, "Fantasy", "Explore magical realms");
        LibrarySection horrorSection = director.construct(builder, "Horror", "Experience fear");
        LibrarySection cafeSection = director.construct(builder, "Cafe", "Relax and enjoy");

        System.out.println("Fantasy Section: " + fantasySection);
        System.out.println("Horror Section: " + horrorSection);
        System.out.println("Cafe Section: " + cafeSection);
    }
}
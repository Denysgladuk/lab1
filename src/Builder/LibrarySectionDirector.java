package Builder;

class LibrarySectionDirector {
    public LibrarySection construct(LibrarySectionBuilder builder, String name, String description) {
        builder.buildName(name);
        builder.buildDescription(description);
        return builder.getLibrarySection();
    }
}

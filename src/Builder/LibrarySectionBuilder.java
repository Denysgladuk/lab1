package Builder;

interface LibrarySectionBuilder {
    void buildName(String name);
    void buildDescription(String description);
    LibrarySection getLibrarySection();
}
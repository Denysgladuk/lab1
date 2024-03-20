package Builder;

class ConcreteLibrarySectionBuilder implements LibrarySectionBuilder {
    private String name;
    private String description;

    @Override
    public void buildName(String name) {
        this.name = name;
    }

    @Override
    public void buildDescription(String description) {
        this.description = description;
    }

    @Override
    public LibrarySection getLibrarySection() {
        return new LibrarySection(name, description);
    }
}

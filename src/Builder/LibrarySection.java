package Builder;

class LibrarySection {
    private String name;
    private String description;

    public LibrarySection(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Section: " + name + ", Description: " + description;
    }
}

package Prototype;

class Book implements Prototype {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Prototype doClone() {
        return new Book(title);
    }
}

public abstract class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean checkedOut;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.checkedOut = false;
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public void returnBook() {
        this.checkedOut = false;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return String.format("%s by %s (ISBN: %s)", title, author, isbn);
    }
}

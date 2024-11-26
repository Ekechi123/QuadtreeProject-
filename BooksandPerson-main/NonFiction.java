public class NonFiction extends Book {
    public NonFiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public String getDetails() {
        return "Non-Fiction Book: " + super.toString();
    }
}

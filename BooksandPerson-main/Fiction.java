public class Fiction extends Book {
    public Fiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public String getDetails() {
        return "Fiction Book: " + super.toString();
    }
}
public class Staff extends Person {
    // Constructor calling the superclass constructor
    public Staff(String name, String id) {
        super(name, id);
    }

    // Overriding the describe method to provide a specific description for Staff
    @Override
    public String describe() {
        return "Staff Member: " + getName() + " (ID: " + getId() + ")";
    }

    // Method to register a book to the library
    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }

    // Method to register a member to the library
    public void registerMember(Library library, Person member) {
        library.registerMember(member);
    }
}

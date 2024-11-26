public class Staff extends Person {
    public Staff(String name, String id) {
        super(name, id);
    }

    @Override
    public String describe() {
        return "Staff Member: " + getName();
    }

    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }

    public void registerMember(Library library, Person member) {
        library.registerMember(member);
    }
}

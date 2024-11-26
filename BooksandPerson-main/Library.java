import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookCollection = new ArrayList<>();
    private List<Person> members = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();

    public void addBook(Book book) {
        bookCollection.add(book);
    }

    public void registerMember(Person member) {
        members.add(member);
    }

    public void hireStaff(Staff staff) {
        staffMembers.add(staff);
    }

    public void listAllBooks() {
        System.out.println("Books in the Library:");
        bookCollection.forEach(book -> System.out.println(book.getDetails()));
    }

    public void listMembers() {
        System.out.println("Registered Members:");
        members.forEach(member -> System.out.println(member.describe()));
    }

    public void listStaff() {
        System.out.println("Library Staff:");
        staffMembers.forEach(staff -> System.out.println(staff.describe()));
    }
}

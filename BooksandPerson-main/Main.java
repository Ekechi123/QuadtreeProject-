public class Main {
    public static void main(String[] args) {
        // Create a person and staff instance
        Person person = new Person("John Doe", "P12345");
        Staff staff = new Staff("Jane Smith", "S67890");

        // Print their descriptions
        System.out.println(person.describe());
        System.out.println(staff.describe());
    }
}

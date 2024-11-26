public class Person {
    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods for name and id
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Method to describe the person, now using the id
    public String describe() {
        return "Person: " + name + " (ID: " + id + ")";
    }
}

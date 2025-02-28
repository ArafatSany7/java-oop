// Base class Person

class Person {

    private String name;
    private int age;
    private String address;
    private String nationalID;

    // Constructor
    public Person(String name, int age, String address, String nationalID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationalID = nationalID;
    }

    // Getter and Setter for nationalID
    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    // Method to display general person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("National ID: " + nationalID);
    }
}

// Intermediate class Faculty that inherits from Person
class Faculty extends Person {

    private String facultyID;

    // Constructor
    public Faculty(String name, int age, String address, String nationalID, String facultyID) {
        super(name, age, address, nationalID);
        this.facultyID = facultyID;
    }

    // Method to display faculty details
    public void showFacultyDetails() {
        displayInfo();
        System.out.println("Faculty ID: " + facultyID);
    }
}

// Derived class Lecturer that inherits from Faculty
class Lecturer extends Faculty {

    private String subject;

    // Constructor
    public Lecturer(String name, int age, String address, String nationalID, String facultyID, String subject) {
        super(name, age, address, nationalID, facultyID);
        this.subject = subject;
    }

    // Method to display the subject being taught
    public void teach() {
        System.out.println("Teaching subject: " + subject);
    }

    // Override displayInfo method to extend its functionality
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teaching subject: " + subject);
    }
}

// Main class to test the hierarchy
public class uni {

    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Alice", 35, "123 Main St", "NID12345", "F123", "Computer Science");
        lecturer.displayInfo();
        lecturer.teach();
    }
}

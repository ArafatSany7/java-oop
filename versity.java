
class Person {

    String name;
    int age;
    String address;
    private String nationalId;

    public Person(String name, int age, String address, String nationalId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationalId = nationalId;

    }

    public String getNationalId() {
        return getNationalId();
    }

    public void setNationalID(String nationalId) {
        this.nationalId = nationalId;
    }

    public void display_info() {

        System.out.println("Name is " + name);
        System.out.println("Age " + age);
        System.out.println("Address " + address);
        System.out.println("National Id " + nationalId);

    }
}

class Faculty extends Person {

    public String facultyId;

    public Faculty(String name, int age, String address, String nationalId, String facultyId) {
        super(name, age, address, nationalId);
        this.facultyId = facultyId;
    }

    public void show_faculty_details() {
        super.display_info();
        System.out.println("Faculty id " + facultyId);
    }

}

class Lecturer extends Faculty {

    public String subject;

    public Lecturer(String name, int age, String address, String nationalId, String facultyId, String subject) {
        super(name, age, address, nationalId, facultyId);

        this.subject = subject;
    }

    public void display() {
        System.out.println("Taught " + subject);
    }

    @Override
    public void display_info() {
        super.display_info();

    }

}

public class versity {

    public static void main(String[] args) {
        Person person = new Person("Kaissa", 34, "japan", "444-66");

        Faculty faculty = new Faculty("Joissa", 97, "modonpur", "44-22", "jibon");

        Lecturer lecturer = new Lecturer("Akber", 27, "Changaon", "241--", "fist", "object");

        person.display_info();
        faculty.show_faculty_details();

        lecturer.display_info();
        lecturer.display();
    }
}


class Employe {

    private String name;
    private double salary;

    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Salary " + salary);
    }

}

class Manager extends Employe {

    private String depertment;

    Manager(String name, double salary, String depertment) {
        super(name, salary);
        this.depertment = depertment;
    }

    public String getDepertment() {
        return getDepertment();
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Depertmetn " + depertment);
    }

}

class Engineer extends Employe {

    private String special;

    public Engineer(String name, double salary, String special) {
        super(name, salary);

        this.special = special;
    }

    public String getSpecial() {
        return getSpecial();
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public void display() {
        super.display();
        System.out.println("Specialization " + special);
    }

}

class Intern extends Employe {

    private String university;

    public Intern(String name, double salary, String university) {
        super(name, salary);
        this.university = university;
    }

    public String getUniversity() {
        return getUniversity();

    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void display() {
        super.display();
        System.out.println("University " + university);

    }

}

public class employee {

    public static void main(String[] args) {

        Intern bolod = new Intern("Bolod", 23000, "DIU");

        bolod.display();

    }
}

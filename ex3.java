
public class ex3 {

    private String name;
    private int id;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        ex3 obj1 = new ex3();

        obj1.setCgpa(3.67);
        obj1.setId(342323);
        obj1.setName("sany");

        System.out.println("Person is " + obj1.getName() + "\n his id is " + obj1.getId() + "\n and cgpa is " + obj1.getCgpa());
    }
}

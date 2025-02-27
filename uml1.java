
public class uml1 {

    String id;
    String name;
    double cgpa;

    public void insert_record(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;

    }

    public void display_record() {
        System.out.println("name : " + name);
        System.out.println("id: " + id);
        System.out.println("cgpa: " + cgpa);
    }

    public static void main(String[] args) {
        uml1 std1 = new uml1();
        std1.insert_record("241", "Sany", 3.67);
        std1.display_record();
    }
}

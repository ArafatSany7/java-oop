
public class myClass {

    public static void main(String[] args) {

        Student student = new Student("sany", 241, 3.65);
        System.out.println("ID: " + student.getId());

    }

    public static class Student {

        private String name;
        private int id;
        private double cgpa;

        public Student(String name, int id, double cgpa) {
            this.name = name;
            this.id = id;
            this.cgpa = cgpa;
        }

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

    }

}

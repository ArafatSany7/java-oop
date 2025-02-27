
public class depertment {

    private String deptName;
    private String faculty;
    private int deptCode;

    public static void main(String[] args) {
        depertment dept = new depertment();
        depertment code = new depertment();

        dept.deptName = "swe";
        dept.faculty = "fist";

        code.deptCode = 216;

        System.out.println("The depertment name is " + dept.deptName + " its belong from " + dept.faculty + " faculty and its code is " + code.deptCode);

    }
}

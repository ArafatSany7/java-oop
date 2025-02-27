
public class privcons {

    private int var;

    public privcons() {
        this.var = 10;
    }

    public privcons(int num) {
        this.var = num;
    }

    public int getValue() {
        return var;
    }

    public static void main(String[] args) {
        privcons obj1 = new privcons();

        privcons obj2 = new privcons(40);

        System.out.println("Number is : " + obj1.getValue());
        System.out.println("Number : " + obj2.getValue());
    }

}

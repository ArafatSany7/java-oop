
public class Box {

    int hight;
    int width;

    Box(int a, int b) {

        this.hight = a;
        this.width = b;

    }

    public static void main(String[] args) {

        Box box1 = new Box(20, 30);
        System.out.println("Hight of the box : " + box1.hight);
        System.out.println("width of the box : " + box1.width);

        Box box2 = new Box(40, 50);

        System.out.println("higth : " + box2.hight);
        System.out.println("Width : " + box2.width);

    }
}


public class overloading {

    int a = 20;
    int b = 30;

    public void two(int a, int b) {
        Math.max(a, b);

    }

    public void three(int a, int b, int c) {
        c = 35;

        Math.max(a, Math.max(b, c));

    }

    public static void main(String[] args) {
        overloading obj = new overloading();
    }
}

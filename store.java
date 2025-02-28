
class Appliance {

    private String brand;
    private int pC;

    public Appliance(String brand, int pC) {
        this.brand = brand;
        this.pC = pC;
    }

    void display() {
        System.out.println("Brand " + brand);
        System.out.println("Power Consumption " + pC);
    }
}

class Ref extends Appliance {

    int capa;

    public Ref(int capa, String brand, int pC) {
        super(brand, pC);
        this.capa = capa;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Capacity \n" + capa);
    }

}

class Wash extends Appliance {

    int lC;

    public Wash(String brand, int pC, int lC) {
        super(brand, pC);
        this.lC = lC;
    }

    @Override
    void display() {
        super.display();
        System.out.println("load Capacity " + lC);
    }
}

class smartWash extends Wash {

    String wifi;

    smartWash(String brand, int pC, String wifi, int lC) {
        super(brand, pC, lC);
        this.wifi = wifi;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Wifi enabled" + wifi);
    }
}

public class store {

    public static void main(String[] args) {
        Ref refri = new Ref(500, "samsu", 240);
        refri.display();

        smartWash smart = new smartWash("Samsu", 240, "True", 8);
        smart.display();
    }
}

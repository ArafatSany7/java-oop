
class vehicle {

    String brand;

    vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Brand" + brand);
    }

}

class car extends vehicle {

    int speed;

    car(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Speed" + speed);
    }

}

class sportsCar extends car {

    String model;

    sportsCar(String brand, int speed, String model) {
        super(brand, speed);
        this.model = model;
    }

    @Override
    void display() {
        super.display();
        System.out.println("model" + model);
    }

}

public class grrage {

    public static void main(String[] args) {
        vehicle newVehicle = new vehicle("Toyota");
        newVehicle.display();

        car newCar = new car("ferrari", 234);
        newCar.display();

        sportsCar newSportsCar = new sportsCar("Porsche", 234, "purusanghe");
        newSportsCar.display();
    }

}

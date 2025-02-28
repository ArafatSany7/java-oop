
class Vehicle {

    public String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Type of the vehile is " + type);
    }

}

class Car extends Vehicle {

    public String car;

    Car(String type, String car) {
        super(type);
        this.car = car;
    }

    @Override
    public void display() {

        System.out.println("This vehicle Type is " + type + " and its called " + car);
    }
}

class Bike extends Vehicle {

    public String bike;

    Bike(String type, String bike) {
        super(type);
        this.bike = bike;
    }

    @Override
    public void display() {
        System.out.println("This vehicle Type is " + type + " and its called" + bike);
    }
}

public class test {

    public static void main(String[] args) {

        Bike bike1 = new Bike("Bike", "ZX10R");
        bike1.display();

        Car car1 = new Car("Car", "Supra");
        car1.display();
    }
}

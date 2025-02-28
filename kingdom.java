
class Animal {

    String name;
    String habitate;

    public Animal(String name, String habitate) {
        this.name = name;
        this.habitate = habitate;
    }

    void display() {
        System.out.println("Name is : " + name + " Habitate : " + habitate);
    }

}

class Bird extends Animal {

    int wing;

    Bird(String name, String habitate, int wing) {
        super(name, habitate);
        this.wing = wing;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Wing" + wing);
    }

}

class Mammal extends Bird {

    int ges;

    Mammal(int ges, String name, String habitate, int wing) {
        super(name, habitate, wing);
        this.ges = ges;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Gestitation" + ges);
    }

}

class Dolphin extends Mammal {

    int sspeed;

    Dolphin(int sspeed, int ges, String name, String habitate, int wing) {
        super(ges, name, habitate, wing);
        this.sspeed = sspeed;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Swim speed is " + sspeed);
    }

}

public class kingdom {

    public static void main(String[] args) {

        Animal elphant = new Animal("Elephant", "pahar");
        elphant.display();

        Dolphin dolphin = new Dolphin(45, 23, "pangash", "sea", 34);
        dolphin.display();
    }
}

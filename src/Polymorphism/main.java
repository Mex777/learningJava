package Polymorphism;
class Car {
    private boolean engine = true;
    private int wheels = 4;
    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
    public int getWheels() {
        return wheels;
    }
    public void startEngine() {
        System.out.println("Engine has started");
    }
    public void breaks() {
        System.out.println("The car stopped");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
class Ferrari extends Car {
    public Ferrari() {
        super("Red", "Ferrari");
    }
}
class BMW extends Car {
    public BMW() {
        super("Blue", "BMW");
    }

    @Override
    public void breaks() {
        System.out.println("This car doesn't have breakes, it's BMW get out of my way");
    }
}
class GeneralCar extends Car {

    public GeneralCar(String color, String model) {
        super(color, model);
    }
}
public class main {
    public static void main(String[] args) {
        Car[] car = new Car[3];
        car[0] = new GeneralCar("Grey", "Chevrolet"); car[1] = new Ferrari(); car[2] = new BMW();
        for (int i=0; i<3; i++) {
            car[i].startEngine();
            System.out.println(car[i].getColor() + " " + car[i].getModel() + " " + car[i].getWheels());
            car[i].breaks();
            System.out.println();
        }
    }
}

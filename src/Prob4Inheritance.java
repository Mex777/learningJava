
public class Prob4Inheritance {
    public static void main(String[] args) {
        Jeep Compass = new Jeep();
        Compass.setType("Compass");
        System.out.println(Compass.typeOfVehicle + "\n" + Compass.model + "\n" + Compass.speed+ "\n" +Compass.getType());
        Compass.sound();
    }
}

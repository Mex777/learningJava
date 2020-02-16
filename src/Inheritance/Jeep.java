

public class Jeep extends Car {
    String model = "Jeep";
    String speed = "Fast";
    private String type;

    public void setType (String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public void sound() {
        System.out.println("Vroom, Vroom!");
    }
}

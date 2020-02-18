package OOPChallenge;

public class deluxeBurger extends burger{
    private String name = "Deluxe burger";
    private double price = 25d;

    public deluxeBurger() {
        super();
    }
    @Override
    public void getToppings() {
        System.out.println("Additions are: french fries and Coca-cola.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    public double getBasePrice() {
        return 25d;
    }
}

package OOPChallenge;

public class deluxeBurger extends burger{
    private String name = "Deluxe burger";
    private double price = 25d;

    public deluxeBurger(String breadType, String meatType) {
        super(breadType, meatType);
    }
    @Override
    public void getToppings() {
        System.out.println("Additions are: french fries and Coca-cola.");
    }
}

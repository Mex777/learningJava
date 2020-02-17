package OOPChallenge;

public class healthyBurger extends burger {
    private String name = "Healthy Burger";
    private double price = 15d;
    private additions additions;


    public healthyBurger(String meatType) {
        super("Brown rye bread roll", meatType);
    }

    public void addTopings(boolean lettuce, boolean tomatoes, boolean carrot, boolean onions, boolean ketchupSauce, boolean mayonnaiseSauce) {
        this.additions = new additions(lettuce, tomatoes, carrot, onions, ketchupSauce, mayonnaiseSauce);
        if (lettuce)
            price += 2.5d;
        if (tomatoes)
            price += 1.25d;
        if (carrot)
            price += 5d;
        if (onions)
            price += 0.75d;
        if (ketchupSauce)
            price += 0.25d;
        if (mayonnaiseSauce)
            price += 0.30d;
    }
    public double getBasePrice() {
        return 15d;
    }
}

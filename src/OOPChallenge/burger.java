package OOPChallenge;

public class burger {
    private String breadType;
    private String meatType;
    private String name = "Regular burger";
    private double price = 10d;
    private boolean ketchupSauce;
    private boolean mayonnaiseSauce;
    private additions additions;

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    // Making a burger Constructor
    public burger() {
        System.out.println("Burger added. Base price: $" + getBasePrice());
    }
    // Adding the toppings using the additions class
    public void addTopings(boolean lettuce, boolean tomatoes, boolean carrot, boolean onions, boolean ketchupSauce, boolean mayonnaiseSauce) {
        ketchupSauce = false; mayonnaiseSauce = false;
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

    public void getToppings() {
        this.additions.toppings();
    }

    public double getPrice() {
        return price;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return 10d;
    }
}

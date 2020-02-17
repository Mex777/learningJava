package OOPChallenge;

public class burger {
    private String breadType;
    private String meatType;
    private String name = "Regular burger";
    private double price = 10d;
    private additions additions;

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public burger(String breadType, String meatType) {
        //System.out.println(getName() + " added. Base price: $" + getBasePrice());
        this.breadType = breadType;
        this.meatType = meatType;

    }
    public burger() {
        System.out.println(getName() + " added. Base price: $" + getBasePrice());
    }

    public void addTopings(boolean lettuce, boolean tomatoes, boolean carrot, boolean onions) {
        this.additions = new additions(lettuce, tomatoes, carrot, onions);
        if (lettuce)
            price += 2.5d;
        if (tomatoes)
            price += 1.25d;
        if (carrot)
            price += 5d;
        if (onions)
            price += 0.75d;
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

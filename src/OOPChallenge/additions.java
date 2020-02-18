package OOPChallenge;

public class additions {
    private int numOfAdditions = 0;
    private boolean lettuce;
    private boolean tomatoes;
    private boolean carrot;
    private boolean onions;
    private boolean ketchupSauce;
    private boolean mayonnaiseSauce;

    // Constructor for the regular burger which has only 4 additions
    public additions(boolean lettuce, boolean tomatoes, boolean carrot, boolean onions) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.carrot = carrot;
        this.onions = onions;
    }
    // Constructor for the healthy burger which has 6 additions
    public additions(boolean lettuce, boolean tomatoes, boolean carrot, boolean onions, boolean ketchupSauce, boolean mayonnaiseSauce) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.carrot = carrot;
        this.onions = onions;
        this.ketchupSauce = ketchupSauce;
        this.mayonnaiseSauce = mayonnaiseSauce;
    }
    // It's a printer for the toppings
    public void toppings() {
        System.out.print("Additions are: ");
        if (this.lettuce)
            System.out.print("letuce ");
        if (this.carrot)
            System.out.print("carrots ");
        if (this.onions)
            System.out.print("onions ");
        if (this.tomatoes)
            System.out.print("tomatoes ");
        if (this.ketchupSauce)
            System.out.println("Ketchup sauce ");
        if (this.mayonnaiseSauce)
            System.out.println("Mayonnaise sauce");
        System.out.println("");
    }
}

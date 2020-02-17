package OOPChallenge;

public class additions {
    private int numOfAdditions = 0;
    private boolean lettuce;
    private boolean tomatoes;
    private boolean carrot;
    private boolean onions;
    private boolean ketchupSauce;
    private boolean mayonnaiseSauce;


    public additions(boolean lettuce, boolean tomatoes, boolean carrot, boolean onions) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.carrot = carrot;
        this.onions = onions;
    }

    public additions(boolean lettuce, boolean tomatoes, boolean carrot, boolean onions, boolean ketchupSauce, boolean mayonnaiseSauce) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.carrot = carrot;
        this.onions = onions;
        this.ketchupSauce = ketchupSauce;
        this.mayonnaiseSauce = mayonnaiseSauce;
    }

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
        System.out.println("");
    }
}

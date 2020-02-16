package Composition;

public class kitchen {
    private Dimensions dimensions;
    private boolean hasFridge;
    private int depth;

    public kitchen(Dimensions dimensions, boolean hasFridge, int depth) {
        this.dimensions = dimensions;
        this.hasFridge = hasFridge;
        this.depth = depth;
    }
    public void setHasFridge() {
        if(hasFridge)
            System.out.println("I have a fridge");
        else
            System.out.println("I don't have a fridge");
    }
}

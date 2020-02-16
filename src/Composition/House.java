package Composition;

public class House {
    private kitchen kitchen;
    private int length;
    private Dimensions dimensions;
    private door door;

    public House(Composition.kitchen kitchen, int length, Dimensions dimensions, Composition.door door) {
        this.kitchen = kitchen;
        this.length = length;
        this.dimensions = dimensions;
        this.door = door;
    }
    public void openDoor() {
        door.doorOpen();
    }
}

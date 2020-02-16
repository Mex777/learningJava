package Composition;

public class main {
    public static void main(String[] args) {
        Dimensions doorDimensions = new Dimensions(200, 150);
        door mainDoor = new door(doorDimensions, "red");
        Dimensions furnitureDimension = new Dimensions(400, 800);
        furniture mobila = new furniture("brown", "oak wood", furnitureDimension);
        kitchen mainKitchen = new kitchen(new Dimensions(2000, 2500),true, 650);
        House newHouse = new House(mainKitchen,20000, new Dimensions(10000, 15000), mainDoor);
        newHouse.openDoor();
    }
}

package Composition;

import java.awt.*;

public class door {
    private Dimensions dimensions;
    private String color;

    public door(Dimensions dimensions, String color) {
        this.color = color;
    }
    public void doorOpen() {
        System.out.println("Main door opened");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

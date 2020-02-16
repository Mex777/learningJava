package Composition;

public class furniture {
    private String color;
    private String material;
    private Dimensions dimensions;

    public furniture(String color, String material, Dimensions dimensions) {
        this.color = color;
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}

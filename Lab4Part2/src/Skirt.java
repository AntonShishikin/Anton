import Implements.WomenClothing;

public class Skirt extends Clothes implements WomenClothing {
    private float length;

    Skirt(Size size, double price, String color, float length) {
        super(size, price, color);
        this.length = length;
    }

    @Override
    public String displayInfo() {
        return "Skirt {" +
                "Size: " + getSize() +
                ", Price: " + getPrice() +
                ", Color: " + getColor() +
                ", Length " + length +
                "}";
    }

    @Override
    public void dressWoman() {
        System.out.println("Beautiful skirt for woman:");
        System.out.println(displayInfo());
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length){
        this.length = length;
    }
}

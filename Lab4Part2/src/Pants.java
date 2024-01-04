import Implements.MenClothing;
import Implements.WomenClothing;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    private String material;
    private String type;

    Pants(Size size, double price, String color, String material, String Type) {
        super(size, price, color);
        this.material = material;
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return "Pants {" +
                "Size: " + getSize() +
                ", Price: " + getPrice() +
                ", Color: " + getColor() +
                ", Type:  " + type +
                "}";
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}

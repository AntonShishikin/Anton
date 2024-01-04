import Implements.MenClothing;

public class Tie extends Clothes implements MenClothing {
    private String type;
    Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    Tie(Size size, double price, String color, String type) {
        super(size, price, color);
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return "Tie {" +
                "Size: " + getSize() +
                ", Price: " + getPrice() +
                ", Color: " + getColor() +
                ", Type:  " + type +
                "}";
    }

    @Override
    public void dressMan() {

    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

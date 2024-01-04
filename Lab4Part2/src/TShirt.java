import Implements.MenClothing;
import Implements.WomenClothing;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    private String manufacturer;

    TShirt(Size size, double price, String color, String manufacturer) {
        super(size, price, color);
        this.manufacturer = manufacturer;
    }

    @Override
    public String displayInfo() {
        return "TShirt {" +
                "Size: " + getSize() +
                ", Price: " + getPrice() +
                ", Color: " + getColor() +
                ", Manufacturer: " + manufacturer +
                "}";
    }

    @Override
    public void dressMan() {
        System.out.println("Man TShirt.");
        System.out.println(displayInfo());
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman TShirt.");
        System.out.println(displayInfo());
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
}

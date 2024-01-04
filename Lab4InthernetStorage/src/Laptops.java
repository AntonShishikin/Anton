public class Laptops extends Products{
    private String color;
    private String processorName;

    Laptops(double price, String name, String country, Types type, String color, String processorName) {
        super(price, name, country, type);
        this.color = color;
        this.processorName = processorName;
    }

    @Override
    public String displayInfo() {
        return "Laptop {" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Country: " + getCountry() +
                ", Color: " + getColor() +
                ", Type:" +getType()+
                ", Processor:" + getProcessoeName()+
                "}";
    }

    public double getProcessoeName() {
        return super.getPrice();
    }

    public String getColor() {
        return color;
    }
}

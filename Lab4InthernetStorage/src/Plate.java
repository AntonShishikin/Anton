public class Plate extends Products{
    private float power;
    Plate(double price, String name, String country, Types type, float power) {
        super(price, name, country, type);
        this.power = power;
    }

    @Override
    public String displayInfo() {
        return "CookPot {" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Country: " + getCountry() +
                ", Power: " + getPower() + "W"+
                ", Type" +getType()+
                "}";
    }

    public float getPower() {
        return power;
    }
}

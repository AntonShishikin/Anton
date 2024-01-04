public class Teapot extends Products{
    private double power;
    Teapot(double price, String name, String country, Types type, double power) {
        super(price, name, country, type);
        this.power = power;
    }

    @Override
    public String displayInfo() {
        return "Teapot {" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Country: " + getCountry() +
                ", Power: " + getPower() + "W" +
                ", Type:" +getType()+
                "}";
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

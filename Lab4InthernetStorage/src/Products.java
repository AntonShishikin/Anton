public abstract class Products {
    private double price;
    private String name;
    private String country;
    private Types type;

    Products(double price, String name, String country, Types type){
        this.price = price;
        this.name = name;
        this.country = country;
        this.type = type;
    }

    public abstract String displayInfo();

    public void setType(Types type) {
        this.type = type;
    }

    public Types getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }
}
